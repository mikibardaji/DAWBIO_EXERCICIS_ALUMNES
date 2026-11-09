/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Exercici2 {

    public static boolean esMajorEdat(int edat) {
        return edat >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix la teva edat: ");
        int edat = sc.nextInt();

        if (esMajorEdat(edat)) {
            System.out.println("Ets major d'edat");
        } else {
            System.out.println("Ets menor d'edat");
        }
    }
}
