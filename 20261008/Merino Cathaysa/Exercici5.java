/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int numero1, numero2;
        //5. Programa que llegeix dos números i 
        //els visualitza en ordre ascendent

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime el primer número: ");
        numero1 = sc.nextInt();
        
        System.out.println("Dime el segundo número y te ordenaré ambos: ");
        numero2 = sc.nextInt();
        
        if (numero1 >= numero2) {
            System.out.println(numero1 + " > " + numero2);
        } else {
            System.out.println(numero2 + " <= " + numero1);
        }
    }
    
}
