/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

/**
 *
 * @author joel
 */

import java.util.Scanner;

public class Exercici4 {

    public static int obteSigne(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un numero enter: ");
        int num = sc.nextInt();

        int resultat = obteSigne(num);

        if (resultat == -1) {
            System.out.println("El numero es negatiu");
        } else if (resultat == 0) {
            System.out.println("El numero es zero");
        } else {
            System.out.println("El numero es positiu");
        }
    }
}
