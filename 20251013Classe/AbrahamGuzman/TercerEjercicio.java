/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class TercerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        int N; 
        int cont = 2; 
        System.out.println("Ingrese un numero ");
        
        N = sc.nextInt();
        
        
        for (cont = 2; cont <=N ; cont++) {
            if (cont%2 ==0 ) {
                System.out.println("Todos los numeros pares de " + N +" Sumados de  2 en 2: ");
                System.out.println(cont);
            }
        }
        
      
         
         
        
    }
    
}
