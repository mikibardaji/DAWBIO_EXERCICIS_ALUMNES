/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exadivinnumpropio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExAdivinNumPropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Dame un número (1-100): ");
        int numP = lector.nextInt();

        int min = 1;
        int max = 100;
        int numC;
        int intentos = 0;

        do {
            numC = random.nextInt(min, max + 1); // max + 1 porque el límite se excluye
            intentos++;
            System.out.println("El ordenador ha dicho: " + numC);

            if (numC < numP) {
                System.out.println("El número es más alto");
                min = numC + 1;
            } else if (numC > numP) {
                System.out.println("El número es más bajo");
                max = numC - 1;
            }
        } while (numC != numP);

        System.out.println("La máquina ha acertado en " + intentos + " intentos");
    }
}