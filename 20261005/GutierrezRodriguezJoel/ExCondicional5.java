/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excondicional;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class ExCondicional5 {
   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Llegir el primer número
        System.out.print("Entra el primer número: ");
        double num1 = lector.nextDouble();
        
        // Llegir el segon número
        System.out.print("Entra el segon número: ");
        double num2 = lector.nextDouble();
        
        // Mostrar en ordre ascendent
        if (num1 < num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}
