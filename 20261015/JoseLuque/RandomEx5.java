import java.util.Random;
import java.util.Scanner;

public class JocDaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatori = new Random();

        // Preguntem a l'usuari quants diners vol apostar
        System.out.print("Quants diners vols apostar? ");
        double aposta = scanner.nextDouble();

        // Generem els dos daus (de l'1 al 6)
        int dau1 = aleatori.nextInt(1, 7);
        int dau2 = aleatori.nextInt(1, 7);
        int suma = dau1 + dau2;

        System.out.println("Has tret un " + dau1 + " i un " + dau2 + " (Suma: " + suma + ")");

        // Comprovem les regles
        if (suma == 7) {
            double guany = aposta;
            System.out.println("Bravo! Has guanyat " + guany + " euros");
        } 
        else if (dau1 == dau2) { // Si els dos números són iguals (doble)
            System.out.println("Has tret un doble! Torna a tirar...");
            
            // Tirem una altra vegada
            int nouDau1 = aleatori.nextInt(1, 7);
            int nouDau2 = aleatori.nextInt(1, 7);
            System.out.println("Segon tir: " + nouDau1 + " i " + nouDau2);

            if (nouDau1 == nouDau2) {
                double guany = aposta * 3;
                System.out.println("COMBO! Tripliques guanques, has guanyat " + guany + " euros");
            } else {
                double guany = aposta * 2;
                System.out.println("Has doblat el valor: guanyes " + guany + " euros");
            }
        } 
        else {
            System.out.println("Has perdut l'aposta");
        }
    }
}
