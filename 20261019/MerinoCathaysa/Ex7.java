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
public class Ex7 {
    
    /*Un cop realitzat el 6, també al acabar te que
    dir quants negatius hi havia. (A l’exercici anterior 
    sol te que avisar que n’hi hagut algún..).
    
    */
    
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
       
        boolean hayNegativo = false;
        int valores;
        int contadorNegativos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce 10 valores de tensión arterial");
            valores = sc.nextInt();
            
            if (valores < 0) {
                hayNegativo = true;
                contadorNegativos++;
            }
        }
        if (hayNegativo) {
            System.out.println("Hay  " + contadorNegativos + " negativos.");
        } else {
            System.out.println("Todos los números son positivos");
        }
                
    }
}
