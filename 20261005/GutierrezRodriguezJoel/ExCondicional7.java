/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excondicional7;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class ExCondicional7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Llegir els tres números
        System.out.print("Entra el primer número: ");
        double num1 = lector.nextDouble();
        
        System.out.print("Entra el segon número: ");
        double num2 = lector.nextDouble();
        
        System.out.print("Entra el tercer número: ");
        double num3 = lector.nextDouble();
        
        // Trobar el més gran
        double mesGran = num1;
        
        if (num2 > mesGran) {
            mesGran = num2;
        }
        
        if (num3 > mesGran) {
            mesGran = num3;
        }
        
        // Mostrar el resultat
        System.out.println("El més gran és: " + mesGran);
    }
}
