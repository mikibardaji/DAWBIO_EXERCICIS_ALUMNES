/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives10;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10. Control de temperatura corporal
        // El programa ha de demanar valors (float) fins que la temperatura sigui 40.5 o més, i després mostrar quants intents han calgut. 
        
        Scanner lector = new Scanner (System.in);
        
        float temperatura = 0;
        int contador = 0;
        
        
        while (temperatura < 40.5){
            System.out.print("Introdueix temperatura corporal: ");
            temperatura = lector.nextFloat();
            contador ++;            
        }
        
        System.out.println("Han calgut " + contador + " mesures.");
        
        
    }
    
}
