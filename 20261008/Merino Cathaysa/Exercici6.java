/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //6. Programa que llegeix dos números i ens diu 
        //quin és el més gran o si són iguals.
        
        Scanner sc = new Scanner (System.in);
        
        int numero1, numero2;
        
        System.out.println("Dime un número: ");
        numero1 = sc.nextInt();
        
        System.out.println("Dime un segundo número y te diré cuál es más grande o si son iguales");
        numero2 = sc.nextInt();
        
        if (numero1 > numero2) {
            System.out.println(numero1 + " es más grande que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es más grande que " + numero1);
        } else {
            System.out.println(numero1 + " y " + numero2 + " son iguales.");
            System.out.println();
        }
        
    }   
    
    
}
