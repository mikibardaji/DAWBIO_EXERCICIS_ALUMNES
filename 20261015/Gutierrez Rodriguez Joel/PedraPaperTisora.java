/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Demana a l’usuari que et demani si tria “pedra, paper o tisora
 * @author jgu3417
 */

import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tria la teva jugada (0: Pedra, 1: Paper, 2: Tisora): ");
        int jugador = scanner.nextInt();

        int ordinador = random.nextInt(3); // 0, 1 o 2

        // Convertim els números a text
        String[] opcions = {"Pedra", "Paper", "Tisora"};

        System.out.println("Tu has triat: " + opcions[jugador]);
        System.out.println("L'ordinador ha triat: " + opcions[ordinador]);

        // Determinem el guanyador
        if (jugador == ordinador) {
            System.out.println("Resultat: Empat!");
        } else if ((jugador == 0 && ordinador == 2) ||  // Pedra guanya a Tisora
                   (jugador == 1 && ordinador == 0) ||  // Paper guanya a Pedra
                   (jugador == 2 && ordinador == 1)) {  // Tisora guanya a Paper
            System.out.println("Resultat: Has guanyat tu!");
        } else {
            System.out.println("Resultat: Ha guanyat l'ordinador!");
        }

        scanner.close();
    }
}
