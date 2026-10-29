
import java.util.Scanner;
import java.util.Random;

public class Exercici13 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random aleatori = new Random();

        int secret = aleatori.nextInt(100) + 1;
        int numero = 0;
        int intents = 0;

        while (numero != secret) {
            System.out.print("Endevina el numero (1-100): ");
            numero = teclat.nextInt();
            intents++;

            if (numero < secret) {
                System.out.println("El numero secret es mes gran.");
            } else if (numero > secret) {
                System.out.println("El numero secret es mes petit.");
            } else {
                System.out.println("Correcte! Has endevinat el numero.");
            }
        }

        System.out.println("Nombre d'intents: " + intents);
        teclat.close();
    }
}

