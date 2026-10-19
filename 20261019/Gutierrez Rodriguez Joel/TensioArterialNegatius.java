/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tensioarterialnegatius;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class TensioArterialNegatius {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int comptador = 1;
        int tensio;
        int negatius = 0;

        while (comptador <= 10) {
            System.out.print("Introdueix la tensió arterial " + comptador + ": ");
            tensio = lector.nextInt();

            if (tensio < 0) {
                negatius++;
            }

            comptador++;
        }

        if (negatius > 0) {
            System.out.println("S'ha detectat algun valor crític.");
        } else {
            System.out.println("No s'ha detectat cap valor crític.");
        }

        System.out.println("Nombre de valors negatius: " + negatius);

        lector.close();
    }
}

