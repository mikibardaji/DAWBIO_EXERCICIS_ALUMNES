/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programes.joc;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mca3765
 */
public class ProgramesJoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        int jugadaOrdenador;
        int jugadaUsuario;
        int puntuacionOrdenador = 0;
        int puntuacionUsuario = 0;
        int puntuacionNula = 0;
        do {
            jugadaOrdenador = aleatori.nextInt(0, 3);
            jugadaUsuario = jugada();
            impJugada("Jugador 1", jugadaUsuario);
            impJugada("Jugador 2", jugadaOrdenador);
            if (ganador(jugadaUsuario, jugadaOrdenador) == 1) {
                puntuacionUsuario = gestionarTirada(ganador(jugadaUsuario, jugadaOrdenador), puntuacionUsuario);

            } else if ((ganador(jugadaUsuario, jugadaOrdenador)) == 2) {
                puntuacionOrdenador = gestionarTirada(ganador(jugadaUsuario, jugadaOrdenador), puntuacionOrdenador);

            } else {
                gestionarTirada(ganador(jugadaUsuario, jugadaOrdenador), puntuacionNula);
            }
            marcador(jugadaUsuario, jugadaOrdenador);
            System.out.println("Jugamos otra vez");
        } while (seguirJugando(puntuacionOrdenador, puntuacionUsuario));
        System.out.println("Se acabo, hemos quedado: ");
        marcador(jugadaUsuario, jugadaOrdenador);
    }

    public static int jugada() {
        Scanner lector = new Scanner(System.in);
        String frase = "Qué quieres sacar? (0 Piedra | 1 Papel | 2 tijera) \nIntroduce el número correspondiente: ";
        boolean valido = false;
        int resposta = 0;
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.nextInt();
                if (resposta >= 0 && resposta <= 2) {
                    valido = true;
                } else {
                    System.out.println("Valor no valido");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valido, has de poner un número");
                System.out.println("");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
    }

    public static int ganador(int choose_player1, int choose_player2) {
        // 0 empate | 1 gana usuario | 2 gana ordenador
        if (choose_player1 == choose_player2) {
            return 0;
        } else if ((choose_player1 == 0 && choose_player2 == 2)
                || (choose_player1 == 1 && choose_player2 == 0)
                || (choose_player1 == 2 && choose_player2 == 1)) {
            return 1;
        }
        return 2;
    }

    public static void impJugada(String quienJuega, int choose) {
        String jugada;

        if (choose == 0) {
            jugada = "Piedra";
        } else if (choose == 1) {
            jugada = "Papel";
        } else {
            jugada = "Tijera";
        }
        System.out.println(quienJuega + " ha usado " + jugada);
    }

    public static boolean seguirJugando(int pointPlayer1, int pointPlayer2) {
        if (pointPlayer1 < 3 && pointPlayer2 < 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void marcador(int pointPlayer1, int pointPlayer2) {
        System.out.println("Marcador:");
        System.out.println("Jugador 1: " + pointPlayer1 + " puntos");
        System.out.println("Jugador 2: " + pointPlayer2 + " puntos");
    }

    public static int gestionarTirada(int ganador, int score) {
        //Random rand = new Random();
        //int jugadaOrdenador = rand.nextInt(0,3); // Genera 0, 1 o 2 (inclosos)
        //System.out.println("Jugada de l'ordinador: " + jugadaOrdenador);

        if (ganador == 0) {
            System.out.println("Hay empate");
        } else if (ganador == 1) {
            System.out.println("Has ganado");
        } else if (ganador == 2) {
            System.out.println("Ha ganado el ordenador");
        }

        return score + 1;
    }
}
