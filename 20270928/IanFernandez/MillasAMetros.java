/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millas.a.metros;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class MillasAMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double millasAMetros = 1852; 
       
        
        Scanner lector = new Scanner(System.in);
        
        
        System.out.print("Quantes milles son? ");
        
        
        double distanciaMilles = lector.nextDouble();
        
        
        double metres = distanciaMilles * millasAMetros;
        
        
        System.out.println("Aixo son " + metres + " metres");
        
    }
    
}
