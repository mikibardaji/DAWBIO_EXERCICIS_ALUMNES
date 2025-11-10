import java.util.Scanner;

public class completo {
    public static void main(String[] args) {
        int score = 0, choose, choose_maquina, score_jugador=0, score_maquina=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos puntos para la victoria? ");
        int puntos_victorias = sc.nextInt();
        
        
        do {
            choose = jugada();
        choose_maquina = jugada_ordenador();
        imp_jugada("jugador1", choose);
        imp_ganador(ganador(choose, choose_maquina));
        score = ganador(choose, choose_maquina);
        if (score == 1){
            score_jugador = aumentar_punto(score_jugador);
        }else if (score == 2) {
            score_maquina = aumentar_punto(score_maquina);
        }
        marcador(score_jugador, score_maquina);

        if (score_jugador == puntos_victorias) {
            System.out.println("Felicidades, le ganaste a la computadora");

        }else if (score_maquina == puntos_victorias) {
            System.out.println("La computadora te ha ganado, perdedor");
        }
        } while (score_jugador< puntos_victorias && score_maquina < puntos_victorias);
        }

    public static int jugada_ordenador(){
        int respuesta  = (int) (Math.random()*2 + 0); 
        return respuesta;
    }



    public static int aumentar_punto(int score){
        return score + 1;
    }
    
    public static int ganador(int choose_player1, int choose_player2){
        int respuesta= 3;
        if (choose_player1 == choose_player2) {
            respuesta = 0;
        }
        if (choose_player1 == 0 && choose_player2 == 1) {
            respuesta = 2;
        }else if (choose_player1 == 1 && choose_player2 == 0) {
            respuesta = 1;
        }else if (choose_player1== 2 && choose_player2 == 0) {
            respuesta = 2;
        }else if (choose_player1 == 0 && choose_player2 == 2) {
            respuesta = 1;
        }else if (choose_player1 == 1 && choose_player2 ==2) {
            respuesta = 1;
        }else if (choose_player1 == 2 && choose_player2 ==1) {
            respuesta = 2;
        }
        return respuesta;
    }

    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        
        while (num < 0 || num > 2) {
            System.out.print("¿Qué sacas? (0 piedra, 1 papel, 2 tijera): ");
            
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < 0 || num > 2) {
                    System.out.println("Valor no válido, intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida, introduce un número entero.");
                sc.next();
            }
        }

        return num;
    }

    public static void imp_jugada(String quien_juega, int choose) {
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println(quien_juega + " saca " + opciones[choose]);
    }

    public static void imp_ganador(int ganador) {
        switch (ganador) {
            case 0:
                System.out.println("hay empate");
                break;
            case 1:
                System.out.println("has ganado");
                break;
            case 2:
                System.out.println("ha ganado el ordenador");
                break;
            default:
                System.out.println("valor inválido: " + ganador);
        }
    }

    public static void marcador(int point_player1, int point_player2) {
        System.out.println("Puntuación jugador 1: " + point_player1);
        System.out.println("Puntuación jugador 2: " + point_player2);
    }
}

