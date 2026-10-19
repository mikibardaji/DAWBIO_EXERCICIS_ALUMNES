/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_parells;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Numeros_Parells {

    /**
     * Programa que entra un número natural N i mostra els números parells compresos 
     * entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Escull un numero natural positiu: ");
        numero = sc.nextInt();
        
        
        while(numero<=0){
            System.out.print("ha de ser positiu o mes gran que zero");
            numero = sc.nextInt();
        }
        
         int parell = 2;
        while (parell<numero){
            System.out.println(parell);  
            parell = parell + 2;
            
            
        }
        
    }
    
}
