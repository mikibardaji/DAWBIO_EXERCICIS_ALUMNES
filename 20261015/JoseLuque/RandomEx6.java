import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random aleatori = new Random();

        // Demanem la tirada a l'usuari
        System.out.print("Tria la teva jugada (0: Pedra, 1: Paper, 2: Tisora): ");
        int usuari = scanner.nextInt();

        // L'ordinador tria un número aleatori entre 0 i 2
        int ordinador = aleatori.nextInt(3);

        // Mostrem el que ha triat l'usuari
        System.out.print("Tu has triat: ");
        if (usuari == 0) {
            System.out.println("Pedra");
        } else if (usuari == 1) {
            System.out.println("Paper");
        } else if (usuari == 2) {
            System.out.println("Tisora");
        }

        // Mostrem el que ha triat l'ordinador
        System.out.print("L'ordinador ha triat: ");
        if (ordinador == 0) {
            System.out.println("Pedra");
        } else if (ordinador == 1) {
            System.out.println("Paper");
        } else if (ordinador == 2) {
            System.out.println("Tisora");
        }

        // Comprovem qui ha guanyat
        System.out.println("Resultat:");
        if (usuari == ordinador) {
            System.out.println("Empat!");
        } else if ((usuari == 0 && ordinador == 2) || 
                   (usuari == 1 && ordinador == 0) || 
                   (usuari == 2 && ordinador == 1)) {
            System.out.println("Has guanyat tu!");
        } else {
            System.out.println("Ha guanyat l'ordinador!");
        }
    }
}
