/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios;
import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Aposta: ");
        double a = s.nextDouble();
        int d1 = (int)(Math.random() * 6) + 1;
        int d2 = (int)(Math.random() * 6) + 1;
        int suma = d1 + d2;
        if (suma == 7) {
            System.out.println("Bravo! Has guanyat " + a + " euros");
        } else if (d1 == d2) {
            int nd1 = (int)(Math.random() * 6) + 1;
            int nd2 = (int)(Math.random() * 6) + 1;
            if (nd1 == nd2) {
                System.out.println("COMBO! Tripliques ganacies, has guanyat " + (a * 3) + " euros");
            } else {
                System.out.println("Has doblat el valor: guanyes " + (a * 2) + " euros");
            }
        } else {
            System.out.println("Has perdut l’aposta");
        }
    }
        }

