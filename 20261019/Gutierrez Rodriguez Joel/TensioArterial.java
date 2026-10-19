/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tensioarterial;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class TensioArterial {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int comptador = 1;
        int tensio;
        boolean critic = false;

        while (comptador <= 10) {
            System.out.print("Introdueix la tensió arterial " + comptador + ": ");
            tensio = lector.nextInt();

            if (tensio < 0) {
                critic = true;
            }

            comptador++;
        }

        if (critic) {
            System.out.println("S'ha detectat algun valor crític.");
        } else {
            System.out.println("No s'ha detectat cap valor crític.");
        }

        lector.close();
    }
}

