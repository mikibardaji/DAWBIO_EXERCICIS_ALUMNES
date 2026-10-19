/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parells2;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class Parells2 {
    public static void main(String[] args) {

        try (Scanner lector = new Scanner(System.in)) {
            System.out.print("Introdueix un número natural N: ");
            int N = lector.nextInt();
            
            int comptador = 2;
            
            while (comptador <= N) {
                System.out.println(comptador);
                comptador = comptador + 2;
            }
        }
    }
}

