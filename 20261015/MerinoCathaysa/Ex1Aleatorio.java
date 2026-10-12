/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex1Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroUsuario;
        int numeroAleatorio = rd.nextInt(1, 11);
        
        do {
            System.out.println("Dime un número entre 1 y 10:");
            numeroUsuario = sc.nextInt();
            

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Has acertado!");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("¡Te has pasado!");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es más grande");
            } else {
                System.out.println("Opción no válida.");
            }
        } while (numeroUsuario != numeroAleatorio);

    }

}
