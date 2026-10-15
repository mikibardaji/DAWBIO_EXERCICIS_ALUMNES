/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        Scanner lector = new Scanner(System.in);
        int dado1 = aleatori.nextInt(1,7);
        int dado2 = aleatori.nextInt(1,7);
        System.out.print("Quants diners vols apostar? ");
        double aposta = lector.nextDouble();

        int suma = dado1 + dado2;

        if (suma == 7) {
            double guany = aposta;
            System.out.println("Bravo! Has guanyat " + guany + " euros");
        } else if (dado1 == dado2) {
            System.out.println("Doble! Torna a tirar...");
            // Si tornem a tirar, necessitem dues noves tirades (dado3 i dado4):
            int dado3 = aleatori.nextInt(1, 7);
            int dado4 = aleatori.nextInt(1, 7);
            System.out.println("Segona tirada: Dau 3 = " + dado3 + ", Dau 4 = " + dado4);

            if (dado3 == dado4) {
                double guany = aposta * 3;
                System.out.println("COMBO! Tripliques ganacies, has guanyat " + guany + " euros");
            } else {
                double guany = aposta * 2;
                System.out.println("Has doblat el valor: guanyes " + guany + " euros");
            }
        } else {
            System.out.println("Has perdut l'aposta");
        }
    }
}
