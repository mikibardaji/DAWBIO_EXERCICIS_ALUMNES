/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 
 * @author cme4538
 */
public class Ex3 {
    
    
    public static void main(String[] args) {
        
        /*
        Programa que entra un número natural N i mostra els 
        números parells compresos entre 1 i N. Per fer-ho utilitzeu 
        un comptador i suma de 2 en 2.
        */
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Dime un número par y te diré cuántos números pares hay hasta él: ");
        numero = sc.nextInt();
        
        while(numero > 1) {
            numero --;
            if (numero %2 == 0) {
                System.out.println("Estos son los números pares: " + numero);
            }  
        }
    }
}
