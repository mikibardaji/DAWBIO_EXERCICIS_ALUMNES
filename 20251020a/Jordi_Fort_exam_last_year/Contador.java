/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.pkg10_exam_last_year;

import java.util.Random;

/**
 *
 * @author jfo9565
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rdm = new Random();
        
        int numero = rdm.nextInt(101);
        System.out.println("Numero al azar:" + numero + "\n");
        
        for (int i = -1; i < numero;numero--) {
            System.out.println(numero);
            if (numero % 5 == 0) {
                System.out.println("----");
                
            }
            
        }
        
    }
    
}
