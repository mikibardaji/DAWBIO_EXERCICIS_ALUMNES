/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Fes un programa que simuli el llançament d’un dau de 6 cares.
 * @author jgu3417
 */


import java.util.Random;

public class LlancamentDau {
    public static void main(String[] args) {
        Random random = new Random();

        int resultat = random.nextInt(6) + 1; // Número entre 1 i 6

        System.out.println("Resultat del dau: " + resultat);

        if (resultat == 6) {
            System.out.println("Has tret un 6!");
        } else if (resultat == 1) {
            System.out.println("Quina mala sort!");
        } else {
            System.out.println("Resultat normal");
        }
    }
}
