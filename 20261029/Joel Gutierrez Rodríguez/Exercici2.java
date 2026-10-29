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

public class Exercici2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double preu;
        double total = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.print("Introdueix el preu del producte (0 per acabar): ");
            String entrada = lector.nextLine();

            try {
                preu = Double.parseDouble(entrada);

                if (preu == 0) {
                    continuar = false;
                } else {
                    total = total + preu;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error de format. Operació cancel·lada per seguretat.");
                continuar = false;
            }
        }

        System.out.println("Total de la compra: " + total + " euros.");

        lector.close();
    }
}