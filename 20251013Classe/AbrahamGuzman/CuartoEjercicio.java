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
public class CuartoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in); 
        int N; 
        int cont = 1; 
        System.out.println("Ingrese un numero ");
        
        N = sc.nextInt();
        
        
        
        System.out.println("Numeros entre 1 y "+ N + " :");
        
        while(cont<=N){
            System.out.println(cont);
            cont++; 
        }
    }
    
}
