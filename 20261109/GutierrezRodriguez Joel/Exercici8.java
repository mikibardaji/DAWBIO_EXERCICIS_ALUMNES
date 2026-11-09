/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;

/**
 *
 * @author joel
 */

import java.util.Scanner;

public class Exercici8 {

    public static int sumatori(int m, int n) {
        int suma = 0;

        for (int i = m; i <= n; i++) {
            suma = suma + i;
        }

        return suma;
    }

    public static int productori(int m, int n) {
        int producte = 1;

        for (int i = m; i <= n; i++) {
            producte = producte * i;
        }

        return producte;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el número m: ");
        int m = sc.nextInt();

        System.out.print("Introdueix el número n: ");
        int n = sc.nextInt();

        System.out.println("El sumatori és: " + sumatori(m, n));
        System.out.println("El productori és: " + productori(m, n));
    }
}
