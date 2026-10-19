/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives7;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7. Un cop realitzat el 6, també al acabar te que dir quants negatius hi havia. (A l’exercici anterior sol te que avisar que n’hi hagut algún..).
        Scanner lector = new Scanner(System.in);
        int valor;
        int critic = 0;
        
        System.out.println("Introdueix 10 valors de tensió arterial: ");
        
        for(int i=1; i<=10; i++){
            
            System.out.print("Introdueix valor " + i + ": ");
            valor = lector.nextInt();
            
            if (valor < 0){
                critic ++;
            }           
            
        }
        if(critic!=0){
            System.out.println("S'HA DETECTAR ERROR DE MESURA!");
            System.out.println("EN TOTAL HI HA: " + critic + " ERRORS.");
        }else{
            System.out.println("Tots els valors son correctes.");
        }
    }
    
}
