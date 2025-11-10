import java.util.Scanner;

public class EX_1_Con_Boolean {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puntos_Jug = 0;
        int puntos_Ord = 0;
        boolean Jug_true = true, Ord_true = true;

        int puntos = pedirpuntosvictoria(sc);

        while (Jug_true == true || Ord_true == true) {
            int jugada_Jug = jugada();
            int jugada_Ord = JugadaOrdenador();

            imp_jugada("Jugador", jugada_Jug);
            imp_jugada("Ordenador", jugada_Ord);

            int resultado = ganador(jugada_Jug, jugada_Ord);
            imp_ganador(resultado);

            if (resultado == 1) {
                puntos_Jug = aumentar_punto(puntos_Jug);
            } else if (resultado == 2) {
                puntos_Ord = aumentar_punto(puntos_Ord);
            }

            marcador(puntos_Jug, puntos_Ord);
            Jug_true = cuanto(puntos_Jug, puntos_Ord, puntos);
            Ord_true = cuanto(puntos_Jug, puntos_Ord, puntos);
        }
        boolean hola = campeon(puntos_Jug, puntos_Ord);
        victoria(hola);

        sc.close();
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
                System.out.println("Has ganado");
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
        System.out.println("Jugador: " + point_player1 + " - Maquina: " + point_player2);  
    }

    //thiago
    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige 0-piedra, 1-papel o 2-tijera: ");
        int eleccion = sc.nextInt();
        return eleccion;
    }

    //Thiago
    public static void imp_jugada(String quien_juega, int choose) {
        String jugada_texto = "";
        switch (choose) {
            case 0:
                jugada_texto = "Piedra";
                break;
            case 1:
                jugada_texto = "Papel";
                break;
            case 2:
                jugada_texto = "Tijera";
                break;
        }
        System.out.println(quien_juega + ": " + jugada_texto);
    }
    public static int pedirpuntosvictoria(Scanner partidas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas victorias para terminar el juego");
        return sc.nextInt();
    }

    public static boolean campeon (int point_player1, int point_player2) {
        if(point_player1 == 3 ) {
            System.out.println("El ganador es el jugador 1");
            return true;
        }
        else{
            System.out.println("El Ganador es el jugador 2");
            return false;
        }
        
    }
    public static void victoria (boolean hola) {
        if (hola == true){
            System.out.println("Tu ganaste");
        }
        else {
            System.out.println("Gano la maquina");
        }
    }
    public static boolean cuanto (int jug, int ord, int max){
        if (jug >= max) {
            return false;
        }
        else if (ord >= max) {
            return false;
        }
        else {
            return true;
        }
    }

}
