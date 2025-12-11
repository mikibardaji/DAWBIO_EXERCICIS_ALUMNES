package Surfers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom del jugador: ");
        String nom = sc.nextLine();

        System.out.print("Nivell (facil/dificil): ");
        String nivell = sc.nextLine();

        Joc joc = new Joc(nom, nivell);

        joc.jugar();
    }
}