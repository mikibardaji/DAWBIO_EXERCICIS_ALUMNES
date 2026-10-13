import java.util.Scanner;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("¿Cuántos euros quieres apostar?");
        double apuesta = sc.nextDouble();

        int dado1 = aleatorio.nextInt(6) + 1;
        int dado2 = aleatorio.nextInt(6) + 1;

        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);

        int suma = dado1 + dado2;

        if (suma == 7) {
            System.out.println("¡Bravo! Has ganado " + apuesta + " euros");

        } else if (dado1 == dado2) {
            System.out.println("Ha salido un doble. Tiramos otra vez.");

            dado1 = aleatorio.nextInt(6) + 1;
            dado2 = aleatorio.nextInt(6) + 1;

            System.out.println("Primer dado: " + dado1);
            System.out.println("Segundo dado: " + dado2);

            if (dado1 == dado2) {
                double premio = apuesta * 3;
                System.out.println("¡COMBO! Triplicas las ganancias, has ganado "
                        + premio + " euros");
            } else {
                double premio = apuesta * 2;
                System.out.println("Has doblado el valor: ganas "
                        + premio + " euros");
            }

        } else {
            System.out.println("Has perdido la apuesta");
        }

        sc.close();
    }
}
