/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;

/**
 *
 * @author Cathy
 */
public class Ex3Aleatorio {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int numeroAleatorio = rd.nextInt(1, 101);
        
        if (numeroAleatorio % 2 == 0) {
            System.out.println("El número " + numeroAleatorio + " es par.");
        } else {
            System.out.println("El numero " + numeroAleatorio + " es impar.");
        }
           
    }
    
}
