import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 100;
        int intents = 0;
        int mesGran = 0;
        int mesPetit = 0;
        char resposta;
        int numero;

        System.out.println("Pensa un número de l'1 al 100...");
        System.out.println("L'ordinador intentarà endevinar-lo!");
        System.out.println("Indica amb '+' si és més gran, '-' si és més petit o '=' si he encertat.");

        do {
            numero = rand.nextInt(max - min + 1) + min; // número aleatori entre min i max
            intents++;
            System.out.println("\nL'ordinador pensa el " + numero);
            System.out.print("He encertat? (+, -, =) : ");
            resposta = sc.next().charAt(0);

            if (resposta == '+') {
                min = numero + 1;
                mesGran++;
            } else if (resposta == '-') {
                max = numero - 1;
                mesPetit++;
            }

        } while (resposta != '=');

        System.out.println("\nT'ho he encertat amb " + intents + " cops, " 
                + mesGran + " cops he dit un número més gran i " 
                + mesPetit + " cop(s) més petit.");

        sc.close();
    }
}
