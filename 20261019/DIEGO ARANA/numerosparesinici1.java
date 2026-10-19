/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosparesinici1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Numerosparesinici1 {

    /**
     * Programa que lee un numero natural N y muestra los números pares comprendidos entre 1 y N, utilizando un contador que suma de 1 en 1.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.print("Entra un numero natural N: ");
        int n = lector.nextInt();
        if (n > 0) {
            System.out.println("Nombres parells entre 1 i " + n + ":");
            
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.format("%d ", i);
                }
            }
            System.out.println();
        }else {
            System.out.println("Has d'entrar un nombre positiu");
        }
    }
    
}

