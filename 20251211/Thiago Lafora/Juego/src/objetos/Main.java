package objetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom del jugador: ");
        String nom = sc.nextLine();

        System.out.print("Nivell (facil/dificil): ");
        String nivell = sc.nextLine();

        Juego joc = new Juego(nom, nivell);
        joc.jugar();

        sc.close();
    }
}
