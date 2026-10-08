/**
 *
 * @author jgu3417
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excondicionals12;

import java.util.Scanner;

public class ExCondicionals12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdueix el preu: ");
        double preu = teclado.nextDouble();

        System.out.print("Introdueix quantitat que paga: ");
        double paga = teclado.nextDouble();

        if (paga > preu) {
            double sobren = paga - preu;
            System.out.println("Sobren " + sobren + "€");
        } else if (paga < preu) {
            double falten = preu - paga;
            System.out.println("Falten " + falten + "€");
        } else {
            System.out.println("No sobra ni falta cap euro");
        }

        teclado.close();
    }
}

