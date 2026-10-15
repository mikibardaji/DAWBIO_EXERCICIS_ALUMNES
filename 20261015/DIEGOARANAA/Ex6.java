/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();

       System.out.println("Tria la teva jugada (0: Pedra, 1: Paper, 2: Tisora): ");
        int usuari = lector.nextInt();

        int ordinador = aleatori.nextInt(3);

        System.out.print("Tu has triat: ");
        if (usuari == 0) {
            System.out.println("Pedra");
        } else if (usuari == 1) {
            System.out.println("Paper");
        } else if (usuari == 2) {
            System.out.println("Tisora");
        } else {
            System.out.println("Opció no vàlida");
        }

        System.out.print("L'ordinador ha triat: ");
        if (ordinador == 0) {
            System.out.println("Pedra");
        } else if (ordinador == 1) {
            System.out.println("Paper");
        } else if (ordinador == 2) {
            System.out.println("Tisora");
        }

        if (usuari == ordinador) {
            System.out.println("Resultat: Empat!");
        } else if (usuari == 0 && ordinador == 2) {
            System.out.println("Resultat: Has guanyat tu!");
        } else if (usuari == 1 && ordinador == 0) {
            System.out.println("Resultat: Has guanyat tu!");
        } else if (usuari == 2 && ordinador == 1) {
            System.out.println("Resultat: Has guanyat tu!");
        } else {
            System.out.println("Resultat: Ha guanyat l'ordinador!");
        }

        lector.close();
    }
}
