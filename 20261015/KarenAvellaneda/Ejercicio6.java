import java.util.Scanner;
import java.util.Random;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Elige tu jugada (0: Piedra, 1: Papel, 2: Tijera):");
        int jugador = sc.nextInt();

        if (jugador < 0 || jugador > 2) {
            System.out.println("Opción incorrecta. Debes elegir 0, 1 o 2.");

        } else {
            int ordenador = aleatorio.nextInt(3);

            if (jugador == 0) {
                System.out.println("Tú has elegido: Piedra");
            } else if (jugador == 1) {
                System.out.println("Tú has elegido: Papel");
            } else {
                System.out.println("Tú has elegido: Tijera");
            }

            if (ordenador == 0) {
                System.out.println("El ordenador ha elegido: Piedra");
            } else if (ordenador == 1) {
                System.out.println("El ordenador ha elegido: Papel");
            } else {
                System.out.println("El ordenador ha elegido: Tijera");
            }

            if (jugador == ordenador) {
                System.out.println("Resultado: ¡Empate!");

            } else if ((jugador == 0 && ordenador == 2)
                    || (jugador == 1 && ordenador == 0)
                    || (jugador == 2 && ordenador == 1)) {
                System.out.println("Resultado: ¡Has ganado tú!");

            } else {
                System.out.println("Resultado: ¡Ha ganado el ordenador!");
            }
        }

        sc.close();
    }
}
