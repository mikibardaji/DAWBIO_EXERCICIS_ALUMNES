/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Programa que llegeix un número i diu si és positiu, 
        //si és zero, o bé i és negatiu.
        
        int numero;
        
        System.out.println("Dime un número y te diré si es positivo o negativo");
        numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El valor es 0");
        }
        
        
    }
    
}
