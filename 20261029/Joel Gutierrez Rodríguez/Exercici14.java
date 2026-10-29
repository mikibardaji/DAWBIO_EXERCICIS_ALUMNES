
import java.util.Scanner;

public class Exercici14 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int minim = 1;
        int maxim = 100;
        int numero;
        int intents = 0;
        String resposta = "";

        while (!resposta.equals("igual") && minim <= maxim) {
            numero = (minim + maxim) / 2;
            intents++;

            System.out.println("El teu numero es " + numero + "?");
            System.out.print("Escriu mes gran, mes petit o igual: ");
            resposta = teclat.nextLine().toLowerCase().trim();

            if (resposta.equals("mes gran")) {
                minim = numero + 1;
            } else if (resposta.equals("mes petit")) {
                maxim = numero - 1;
            } else if (resposta.equals("igual")) {
                System.out.println("L'ordinador ha endevinat el numero!");
            } else {
                System.out.println("Resposta no valida.");
                resposta = "";
            }
        }

        if (minim > maxim) {
            System.out.println("Les respostes son contradictories.");
        }

        System.out.println("Nombre d'intents: " + intents);
        teclat.close();
    }
}
