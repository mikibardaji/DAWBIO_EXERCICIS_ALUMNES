/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xabiel
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
       
        int max = 100, min = 1;
        int maquina;
        char usuario;
        boolean acerto = false;
        int intentos,conmas = 0, conmenos = 0;
        System.out.println("Piensa en un número entre 1 y 100, y lo intentaré adivinar 😎");
        System.out.println("Cuantos intentos me quieres dar 😊");
        intentos = sc.nextInt();
        do {
            System.out.println("\nRango actual: " + min + " - " + max);

            maquina = rd.nextInt(min, max + 1);
            System.out.println("¿Tu número es " + maquina + "? (S/N)");
            usuario = sc.next().charAt(0);

            if (usuario == 's' || usuario == 'S') {
                System.out.println("¡Lo adiviné! 😁");
                acerto = true;
            } else if (usuario == 'n' || usuario == 'N') {
                System.out.println("¿Tu número es mayor (+) o menor (-)?");
                usuario = sc.next().charAt(0);

                if (usuario == '+') {
                    min = maquina + 1;
                    conmas++;
                } else if (usuario == '-') {
                    max = maquina - 1;
                    conmenos++;
                } else {
                    System.out.println("Opción no válida 😐");
                }

                // Detección de trampas
                if ((min > max) || (min == max && (usuario == '+' || usuario == '-'))) {
                    System.out.println("¡Estás haciendo trampas! 😡");
                    acerto = true; // termina el juego
                }
            } else {
                System.out.println("Respuesta no válida, usa S o N.");
            }
            
            
            intentos--;
             System.out.println("Me quedan "+ intentos);
        } while (!acerto && intentos!=0);
                 System.out.println("He hecho " + (conmas + conmenos) + " intentos, he dicho " + conmas + " veces un número más pequeño y " + conmenos + " veces un número más grande.");
    }
    
}
