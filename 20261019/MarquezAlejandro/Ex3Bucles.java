/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3bucles;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex3Bucles {

    /**
     * @param args the command line arguments
     * Programa que entra un número natural N i mostra els números 
     * parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int contador_i = 2, numusr = 2, nummax;
        
        System.out.print("Dime un numero para contar par hasta: ");
        nummax = sc.nextInt();
        
        while(numusr <= nummax){
            System.out.println(contador_i +"."+"  numero par " + numusr);
            contador_i = contador_i+2;
            numusr = numusr+2;
            
        }
        System.out.println("");
        
    }
    
    
}
