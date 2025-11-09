import java.util.Scanner;
import java.util.Random;

public class jocmodulss {
public static void main(String[] args) {
    int puntos_Jug = 0;
    int puntos_Ord = 0;
    int jugada_Jug = jugada();
    int jugada_Ord = jugada_ordenador();

    imp_jugada("Jugador:", jugada_Jug);
    imp_jugada("Ordenador:", jugada_Ord);
    int resultado = ganador(jugada_Jug, jugada_Ord);
    imp_ganador(resultado);

    if (resultado == 1){
        puntos_Jug = aumentar_punto(puntos_Jug);
    }
    else if (resultado == 2){
        puntos_Ord = aumentar_punto(puntos_Ord);
    }
    marcador(puntos_Jug, puntos_Ord);
    
}
    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean respuestav = false;
        do {
            System.out.println("Que sacas? (0 Piedra, 1 Papel, 2 Tijera): ");
            opcion = sc.nextInt();
            if (opcion == 0 || opcion == 1 || opcion == 2) {
                respuestav = true;
            } else {
                System.out.println("Error. Introduce 0, 1 o 2.");
            }
        } while (!respuestav);
        return opcion;
    }

    public static int jugada_ordenador() {
        Random rd = new Random();
        return rd.nextInt(0,3);
    }

  
    public static void imp_jugada(String quien_juega, int choose) {
        if (choose == 0) {
            System.out.println(quien_juega + " Piedra");
        } else if (choose == 1) {
            System.out.println(quien_juega + " Papel");
        } else if (choose == 2) {
            System.out.println(quien_juega + " Tijera");
        }
    }

    public static void marcador(int point_player1, int point_player2) {
        System.out.println("---Marcador:---");
        System.out.println("Jugador: " + point_player1);
        System.out.println("Ordenador: " + point_player2);
    }

  
    public static int aumentar_punto(int score) {
        return score + 1;
    }

    public static int ganador(int choose_player1, int choose_player2) {
        if (choose_player1 == choose_player2) {
            return 0; 
        } else if ((choose_player1 == 0 && choose_player2 == 2) ||
                   (choose_player1 == 1 && choose_player2 == 0) ||
                   (choose_player1 == 2 && choose_player2 == 1)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            System.out.println("Empate...");
        } else if (ganador == 1) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Ha ganado el ordenador!");
        }
    }
    }