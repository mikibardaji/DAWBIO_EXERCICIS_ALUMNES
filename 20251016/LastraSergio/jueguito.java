import java.util.Scanner;
import java.util.Random;

public class jueguito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Pensa un número entre 0 i 100 (inclosos).");
        System.out.println("Responds amb: 'h' si el meu nombre és massa baix,");
        System.out.println("'l' si és massa alt, 'c' si és correcte.");

        int low = 0;
        int high = 100;
        int intents = 0;

        while (low <= high) {
            
            int mig = rd.nextInt(low,high);
            intents++;
            System.out.print("És " + mig + "? (c/h/l): ");
            String resp = sc.next().toLowerCase();

            
            char ch = resp.charAt(0);

            if (ch == 'c') {
                System.out.println("He endevinat el teu número en " + intents + " intents.");
                sc.close();
                return;
            } else if (ch == 'h') {
                low = mig + 1;
            } else if (ch == 'l') {
                high = mig - 1;
            } else {
                System.out.println("Resposta no vàlida. Usa 'c', 'h' o 'l'.");
                intents--;
            }
        }

        System.out.println("Sembla que no hi he pogut endivinar el numero.");
        sc.close();
    }
}
