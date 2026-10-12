import java.util.Scanner;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("¿Cuántos euros quieres apostar?");
        double apuesta = sc.nextDouble();

        // Primera tirada de los dos dados
        int dado1 = aleatorio.nextInt(6) + 1;
        int dado2 = aleatorio.nextInt(6) + 1;

        System.out.println("Primer dado: " + dado1);
        System.out.println("Segundo dado: " + dado2);

        if (dado1 + dado2 == 7) {
            System.out.println("¡Bravo! Has ganado " + apuesta + " euros");

        } else if (dado1 == dado2) {
            System.out.println("¡Ha salido un doble! Tiramos otra vez.");

            // Segunda tirada
            dado1 = aleatorio.nextInt(6) + 1;
            dado2 = aleatorio.nextInt(6) + 1;

            System.out.println("Primer dado: " + dado1);
            System.out.println("Segundo dado: " + dado2);

            if (dado1 == dado2) {
                System.out.println("¡COMBO! Triplicas las ganancias, has ganado "
                        + (apuesta * 3) + " euros");
            } else {
                System.out.println("Has doblado el valor: ganas "
                        + (apuesta * 2) + " euros");
            }

        } else {
            System.out.println("Has perdido la apuesta");
        }

        sc.close();
    }
}
