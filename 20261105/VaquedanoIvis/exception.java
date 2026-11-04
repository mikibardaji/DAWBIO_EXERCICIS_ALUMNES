/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerexcep;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class ExerExcep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner teclado = new Scanner(System.in);

        double precio;
        double total = 0;
        boolean continuar = true;

        while (continuar) {

            try {
                System.out.println("Introduce el precio del producto (0 para terminar):");
                String entrada = teclado.nextLine();

                precio = Double.parseDouble(entrada);

                if (precio == 0) {
                    continuar = false;
                } else {
                    total = total + precio;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error de formato. Operación cancelada por seguridad.");
                continuar = false;
            }
        }

        System.out.println("Total de la compra: " + total + " €");

        teclado.close();
    }
}

    
    

