/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici7;

/**
 *
 * @author joel
 */

import java.util.Scanner;

public class Exercici7 {

    public static float preuAmbIva(float preu) {
        return preu * 1.21f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;

        do {
            System.out.print("Introdueix el preu de l'article: ");
            float preu = sc.nextFloat();

            System.out.println("El preu amb IVA és: " + preuAmbIva(preu) + " euros");

            System.out.print("Vols introduir un altre article? (si/no): ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("si"));

    }
}
