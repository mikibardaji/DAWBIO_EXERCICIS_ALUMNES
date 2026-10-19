/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerospares;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Numerospares {

    /**
     * Programa que lee un número natural N y muestra los numeros pares comprendidos entre 1 y N,utilizando un contador que suma de 2 en 2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.print("Entra un numero natural N: ");
        int n = lector.nextInt();
        if (n > 0) {
            System.out.println("Numeros pares entre 1 y " + n + ":");
            
            for (int i = 2; i <= n; i += 2) {
                System.out.format("%d ", i);
            }
            System.out.println();
        } else {
            
        }
        
    }
    
}
