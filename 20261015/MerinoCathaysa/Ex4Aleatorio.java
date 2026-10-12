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
public class Ex4Aleatorio {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int caraDado = rd.nextInt(1, 7);
        
        if (caraDado == 1) {
            System.out.println("Ha salido " + caraDado + " ¡Qué mala suerte!");
        } else if (caraDado == 6) {
            System.out.println("¡Has sacado un " + caraDado + "!");
        } else {
            System.out.println("Resultado normal, has sacado " + caraDado);
        }
        
    }
}
