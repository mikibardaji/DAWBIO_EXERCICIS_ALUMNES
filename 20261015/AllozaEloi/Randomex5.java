/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomex5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Randomex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();

        System.out.print("Quants diners vols apostar? ");
        double aposta = lector.nextDouble();

        int dau1 = aleatori.nextInt(6) + 1;
        int dau2 = aleatori.nextInt(6) + 1;

        System.out.println("Primer dau: " + dau1);
        System.out.println("Segon dau: " + dau2);

        if (dau1 + dau2 == 7) {
            System.out.println("Bravo! Has guanyat " + aposta + " euros");

        } else if (dau1 == dau2) {

            System.out.println("Has tret un doble!");

            int dau3 = aleatori.nextInt(6) + 1;
            int dau4 = aleatori.nextInt(6) + 1;

            System.out.println("Nou primer dau: " + dau3);
            System.out.println("Nou segon dau: " + dau4);

            if (dau3 == dau4) {
                System.out.println("COMBO! Tripliques guanys, has guanyat "
                        + (aposta * 3) + " euros");
            } else {
                System.out.println("Has doblat el valor: guanyes "
                        + (aposta * 2) + " euros");
            }

        } else {
            System.out.println("Has perdut l'aposta");
        }
    }
    
}
