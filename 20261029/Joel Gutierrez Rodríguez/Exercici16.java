
import java.util.Scanner;

public class Exercici16 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        double temperatura;
        double maxima = 0;
        double minima = 0;
        double suma = 0;
        double mitjana;
        int quantitat = 0;

        System.out.print("Introdueix una temperatura (-1 per acabar): ");
        temperatura = teclat.nextDouble();

        while (temperatura != -1) {
            if (quantitat == 0) {
                maxima = temperatura;
                minima = temperatura;
            } else {
                if (temperatura > maxima) {
                    maxima = temperatura;
                }

                if (temperatura < minima) {
                    minima = temperatura;
                }
            }

            suma = suma + temperatura;
            quantitat++;

            System.out.print("Introdueix una temperatura (-1 per acabar): ");
            temperatura = teclat.nextDouble();
        }

        if (quantitat == 0) {
            System.out.println("No s'ha introduit cap temperatura.");
        } else {
            mitjana = suma / quantitat;

            System.out.println("Temperatura maxima: " + maxima);
            System.out.println("Temperatura minima: " + minima);
            System.out.println("Temperatura mitjana: " + mitjana);
        }

        teclat.close();
    }
}

