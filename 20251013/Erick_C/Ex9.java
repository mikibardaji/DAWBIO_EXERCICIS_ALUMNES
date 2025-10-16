/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_trece_octubre;

import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
          Scanner sc = new Scanner(System.in); // escaner para dar datos por teclado
        double pulsaciones; //pulsaciones con decimales
        double suma = 0; 
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce pulsaciones minuto " + i + ": ");
            pulsaciones = sc.nextDouble();
            suma += pulsaciones;
        }
        
        double media = suma / 5;
        System.out.println("Media = " + media + " bpm");
        

    }
    
}
