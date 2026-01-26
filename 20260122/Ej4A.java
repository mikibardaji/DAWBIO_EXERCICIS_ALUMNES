/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4a;
import java.util.Random;
/**
 *
 * @author claud
 */
public class Ej4A {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[20];
        Random rd = new Random();
        int positius = 0;
        int negatius = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(-50,101);
            System.out.println("Posicio- " + i + ": " + numeros[i]);

            if (numeros[i] > 0) {
                positius++;
            } else if (numeros[i] < 0) {
                negatius++;
            }
        }
        System.out.println("Numeros positius: " + positius);
        System.out.println("Numeros negatius: " + negatius);
    
    }
    
}
