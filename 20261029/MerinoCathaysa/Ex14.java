/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int minimo = 1;
        int maximo = 100;
        int numero;
        char respuesta;

        System.out.println("Piensa un número del 1 al 100.");

        do {
            numero = rd.nextInt(minimo, maximo + 1);

            System.out.println("¿Es el número " + numero + "?");
            System.out.println("M: El número es mayor");
            System.out.println("m: El número es menor");
            System.out.println("i: Has acertado");

            respuesta = sc.next().charAt(0);

            if (respuesta == 'M') {
                minimo = numero + 1;
            } else if (respuesta == 'm') {
                maximo = numero - 1;
            }

        } while (respuesta != 'i' && minimo <= maximo);

        if (respuesta == 'i') {
            System.out.println("¡He adivinado tu número!");
        } else {
            System.out.println("Las respuestas no son correctas.");
        }
        
        
    }
    
}
