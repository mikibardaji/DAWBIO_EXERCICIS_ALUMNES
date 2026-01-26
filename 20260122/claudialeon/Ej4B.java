/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4b;
import java.util.Random;
/**
 *
 * @author claud
 */
public class Ej4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros = new int[20];
        Random rd = new Random();

        int sumaPositius = 0;
        int sumaNegatius = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(-50,101);
            System.out.println("Posicio- " + i + ": " + numeros[i]);

            if (numeros[i] > 0) {
                sumaPositius += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegatius += numeros[i];
            }
        }

        System.out.println("Suma valors positius: " + sumaPositius);
        System.out.println("Suma valores negatius: " + sumaNegatius);
    }
    
}
