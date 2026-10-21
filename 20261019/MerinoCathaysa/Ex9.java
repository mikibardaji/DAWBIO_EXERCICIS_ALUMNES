/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int pulsaciones, contador = 1;
        double suma = 0;
        
        
      
        do {
            
            System.out.println("Dime las pulsaciones del paciente entre 30 y 150 " + contador +":");
            pulsaciones = sc.nextInt();
            contador++;
            suma += pulsaciones;
            
        } while (contador < 6);
        
        suma = suma / 5;
        System.out.println("La media es: " + suma);
        
//        for (int i = 1; i < 5; i++) {
//            System.out.println("Introduce pulsaciones por minutos: " + i + ": " + pulsaciones);
//        }
        
    }
    
}
