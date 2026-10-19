/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exnumparells;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExNumParells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int parell, numero;
        numero = 0;
        System.out.print("Diguem un número: ");
        parell = lector.nextInt();
        
        do{
            System.out.println(numero);
            numero = numero + 2; 
        }while(numero <= parell);
    }
    
}
