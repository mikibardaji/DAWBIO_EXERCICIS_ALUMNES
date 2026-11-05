/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixaregistradora;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Caixaregistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double total = 0;
        String entrada;

        while (true) {

            System.out.println("Introdueix el preu del producte (0 para finalitzar):");

            entrada = sc.nextLine();

            try {

                double precio = Double.parseDouble(entrada);

                if (precio == 0) {
                    break;
                }

                total += precio;

            } catch (NumberFormatException e) {

                System.out.println("Error de format. Operació cancelada per seguretat.");

                break;
            }
        }

        System.out.println("Total de la compra: " + total + " €");

    }
}
    

