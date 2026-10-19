/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author ago4635
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3.	Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un numero N");
        int num = lector.nextInt();

        for (int i = 2; i <= num; i=i + 2) {
            System.out.println("Numero par " + i);
        }
        System.out.println("The end. No hay mas numeros pares");

    }

}
