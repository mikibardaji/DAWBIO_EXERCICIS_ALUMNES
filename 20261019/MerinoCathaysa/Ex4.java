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
public class Ex4 {
    
    
    public static void main(String[] args) {
        
        /*
        Programa que entra un número natural N i mostra els números
        parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador 
        sumant d'1 en 1.
        */
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.println("Dime un número y mostraré todos los números hasta ese");
        numero = sc.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            System.out.println("Estos son todos los números hasta " + numero + ": " + i);
        }
        
    }
}
