/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3condicionals;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici3condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1, numero2;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pedir número 1:");
        numero1 = sc.nextInt();
        
        System.out.println("Pedir número 1:");
        numero2 = sc.nextInt();
        
        
        if (numero1 > numero2) {
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
    }
    
}
