/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2bublesexeception;
import java.util.*;


public class Ex2buclesexeception {


    public static void main(String[] args) {
            
        Scanner lector = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Introduce precio: ");
            String entrada = lector.nextLine();

            try {
                double preu = Double.parseDouble(entrada);

                if (preu == 0) {
                    break; 
                }

                total= preu+total;

            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida.");
                break; 
            }
        }

        System.out.println("Total de la compra: " + total + " euros");
    }
}

    
    
