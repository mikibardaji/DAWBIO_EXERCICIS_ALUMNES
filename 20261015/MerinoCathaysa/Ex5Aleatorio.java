/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Ex5Aleatorio {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("¿Cuánto dinero quieres apostar?");
        int dineroApostado = sc.nextInt();
        
        int dado1 = rd.nextInt(1, 7);
        int dado2 = rd.nextInt(1, 7);
        
        System.out.println("Ha salido " + dado1 + " y " + dado2);
        
        if (dado1 + dado2 == 7) {
            System.out.println("Bravo has ganado " + dineroApostado + "€");
        } else if (dado1 == dado2) {
                dado1 = rd.nextInt(1, 7);
                dado2 = rd.nextInt(1, 7);
                System.out.println("Ha salido " + dado1 + " y " + dado2);
            if (dado1 == dado2) {
                dineroApostado = dineroApostado*3;
                System.out.println("¡¡COMBO!! Triplicas tu ganancia: " + dineroApostado);
            } else {
                dineroApostado = dineroApostado*2;
                System.out.println("Has doblado el valor: " + dineroApostado);
            }
        } else {
            System.out.println("Has perdido la apuesta.");
        }
    }
}
