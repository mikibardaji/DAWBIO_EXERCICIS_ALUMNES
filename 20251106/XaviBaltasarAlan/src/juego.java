import java.util.Scanner;
import java.util.Random;

public class juego {

    // Pide jugada al jugador
    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("¿Qué sacas? (0 Piedra, 1 Papel, 2 Tijera)");
            respuesta = sc.nextInt();
        } while (respuesta < 0 || respuesta > 2);
        return respuesta;
    }

    // Jugada aleatoria ordenador
    public static int jugada_ordenador() {
        Random rnd = new Random();
        return rnd.nextInt(3); // devuelve 0-2
    }

    // Imprime jugada
    public static void imp_jugada(String quien_juega, int choose) {
        String jugada = "";
        if (choose == 0) jugada = "Piedra";
        else if (choose == 1) jugada = "Papel";
        else if (choose == 2) jugada = "Tijera";

        System.out.println(quien_juega + ": " + jugada);
    }

    // Decide ganador
    // 0 empate, 1 jugador, 2 ordenador
    public static int ganador(int choose_player1, int choose_player2) {
        if (choose_player1 == choose_player2) return 0;
        if (choose_player1 == 0 && choose_player2 == 2) return 1;
        if (choose_player1 == 1 && choose_player2 == 0) return 1;
        if (choose_player1 == 2 && choose_player2 == 1) return 1;
        return 2;
    }

    // Imprime resultado de la ronda
    public static void imp_ganador(int ganador) {
        if (ganador == 0) System.out.println("Hay empate.");
        else if (ganador == 1) System.out.println("Has ganado!");
        else System.out.println("Has perdido.");
    }

    // Suma punto
    public static int aumentar_punto(int score) {
        return score + 1;
    }

    // Marcador
    public static void marcador(int point_player1, int point_player2) {
        System.out.println("Puntos Jugador 1: " + point_player1);
        System.out.println("Puntos Jugador 2: " + point_player2);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntosJ1 = 0;
        int puntosJ2 = 0;
        String seguir;

        do {
            int j1 = jugada();          // jugador elige
            int j2 = jugada_ordenador(); // ordenador elige

            imp_jugada("Jugador 1", j1);
            imp_jugada("Ordenador", j2);

            int resultado = ganador(j1, j2);
            imp_ganador(resultado);

            if (resultado == 1) puntosJ1 = aumentar_punto(puntosJ1);
            else if (resultado == 2) puntosJ2 = aumentar_punto(puntosJ2);

            marcador(puntosJ1, puntosJ2);

            System.out.println("¿Quieres jugar otra ronda? (s/n)");
            seguir = sc.next().toLowerCase();

        } while (seguir.equals("s"));

        System.out.println("Juego terminado.");
    }
}
