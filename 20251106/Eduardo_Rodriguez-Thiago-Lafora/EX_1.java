import java.util.Scanner;

public class EX_1 {

    public static void main(String[] args) {
       int puntos_Jug = 0;
        int puntos_Ord = 0;

        while (puntos_Jug < 3 && puntos_Ord < 3) {
            int jugada_Jug = jugada();
            int jugada_Ord = JugadaOrdenador();

            imp_jugada(); // ya tienes una función para mostrar o pedir jugada (no duplico nada)
            int resultado = ganador(jugada_Jug, jugada_Ord);
            imp_ganador(resultado);

            if (resultado == 1) {
                puntos_Jug = aumentar_punto(puntos_Jug);
            } else if (resultado == 2) {
                puntos_Ord = aumentar_punto(puntos_Ord);
            }

            marcador(puntos_Jug, puntos_Ord);
        }
        
    }
    //Eduardo
    public static int JugadaOrdenador() {
        int a = (int)(Math.random() * (2 - 0 + 1)) + 0; 
        System.out.println();
        return a;
        
    }
    //Eduardo
    public static void imp_ganador (int ganador) {
        switch (ganador) {
            case 0:
                System.out.println("Hay empate");
                break;
            case 1:
                System.out.println("Has gando");
                break;
            case 2:
                System.out.println("Ha ganado el ordenador");
                break;
        
        }
    }
    //Eduardo
    public static int aumentar_punto(int score) {
        score ++;
        return score;
        
    }
    //Eduardo
    public static int ganador(int choose_player1, int choose_player2) {

        if (choose_player1 == choose_player2) {
            return 0;
        }
        else if ((choose_player1==0 && choose_player2==2)||(choose_player1==1 && choose_player2==0)||(choose_player1==2 && choose_player2==1) ) {
            return 1;
        }
        else {
            return 2;
        }
    }
    //thiago
    public static void marcador(int point_player1, int point_player2) {
        System.out.println("Jugador 1: " + point_player1 + " - Jugador 2: " + point_player2);  
    }
    //thiago
    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige 0-piedra, 1-papel o 2-tijera: ");
        int eleccion = sc.nextInt();
        return eleccion;
    }
    //Thiago
    public static String imp_jugada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige piedra, papel o tijera: ");
        String jugador = sc.nextLine();
        return jugador;
    }

}
