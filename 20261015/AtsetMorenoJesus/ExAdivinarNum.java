/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class AdivinaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatori = new Random();
        Scanner lector = new Scanner(System.in);
        int numeroAleatori = aleatori.nextInt(11);
        System.out.print("Dime un numero: ");
        int numero = lector.nextInt();
        if(numero == numeroAleatori){
            System.out.println("Has acertado");
        } 
        else if(numero > numeroAleatori){
            System.out.println("Te has pasado");
        }
        else {
            System.out.println("El número es más grande");
        }
    }
    
}
