/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Simula un joc de dos daus. Genera aleatoriament dos números entre 1 y 6.
 * @author jgu3417
 */

import java.util.Random;
import java.util.Scanner;

public class JocDeDaus {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generem els dos daus
        int dau1 = random.nextInt(6) + 1;
        int dau2 = random.nextInt(6) + 1;

        System.out.println("Dau 1: " + dau1);
        System.out.println("Dau 2: " + dau2);

        // Demanem l'aposta
        System.out.print("Quants diners vols apostar? ");
        int aposta = scanner.nextInt();

        int suma = dau1 + dau2;

        if (suma == 7) {
            // Guanya el mateix que ha apostat
            System.out.println("Bravo! Has guanyat " + aposta + " euros");
        } else if (dau1 == dau2) {
            // És un doble → es torna a tirar
            System.out.println("Has tret un doble! Es torna a tirar...");

            int dau3 = random.nextInt(6) + 1;
            int dau4 = random.nextInt(6) + 1;

            System.out.println("Segona tirada → Dau 1: " + dau3 + " | Dau 2: " + dau4);

            if (dau3 == dau4) {
                // Un altre doble → guanya el triple
                int guany = aposta * 3;
                System.out.println("COMBO! Tripliques ganacies, has guanyat " + guany + " euros");
            } else {
                // No és doble → guanya el doble
                int guany = aposta * 2;
                System.out.println("Has doblat el valor: guanyes " + guany + " euros");
            }
        } else {
            // No és 7 ni doble
            System.out.println("Has perdut l’aposta");
        }

        scanner.close();
    }
}
