/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int nota = 0;
        boolean correcte = false;

        while (!correcte) {

            System.out.print("Introdueix la nota final: ");
            String entrada = lector.nextLine();

            try {
                nota = Integer.parseInt(entrada);

                if (nota >= 0 && nota <= 10) {
                    correcte = true;
                } else {
                    System.out.println("La nota ha d'estar entre 0 i 10.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Has d'introduir un nombre sencer.");
            }
        }

        System.out.println("Nota registrada correctament: " + nota + ".");

        lector.close();
    }
}
