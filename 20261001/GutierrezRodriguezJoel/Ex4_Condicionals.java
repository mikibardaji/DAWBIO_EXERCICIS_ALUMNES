/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4_condicionals;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class Ex4_Condicionals {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Llegir el número
        System.out.print("Entra un número: ");
        double num = lector.nextDouble();
        
        // Comprovar si és positiu, zero o negatiu
        if (num > 0) {
            System.out.println("El número és positiu.");
        } else if (num == 0) {
            System.out.println("El número és zero.");
        } else {
            System.out.println("El número és negatiu.");
        }
    }
}
