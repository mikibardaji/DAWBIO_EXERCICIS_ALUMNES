/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semafor;

import java.util.Scanner;

/**
 *
 * @author ago4635
 */
public class Semafor {

   
    public static void main(String[] args) {
        char color;
        System.out.println(" Introduzca color semaforo: V-Verde R-Rojo A-Ambar");
        Scanner lector = new Scanner(System.in);
        color = lector.next().charAt(0);
        switch (color) {
            case 'V':
                System.out.println("Verde. Esperar");
                break;
            case 'R':
                System.out.println("Rojo. Parar");
                break;
            case 'A':
                System.out.println("Ambar . Correr");
                break;

            default:
                System.out.println("Color no valido");
        }

    }

}
