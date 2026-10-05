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

public class ExCondicional6 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Llegir el primer número
        System.out.print("Entra el primer número: ");
        double num1 = lector.nextDouble();
        
        // Llegir el segon número
        System.out.print("Entra el segon número: ");
        double num2 = lector.nextDouble();
        
        // Comprovar quin és el més gran o si són iguals
        if (num1 > num2) {
            System.out.println("El més gran és: " + num1);
        } else if (num2 > num1) {
            System.out.println("El més gran és: " + num2);
        } else {
            System.out.println("Els dos números són iguals.");
        }
    }
}
