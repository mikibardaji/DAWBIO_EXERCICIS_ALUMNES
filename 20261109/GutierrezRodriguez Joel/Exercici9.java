/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Exercici9 {

    public static int major(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = sc.nextInt();

        System.out.print("Introdueix el tercer número: ");
        int num3 = sc.nextInt();

        int resultat = major(num1, num2);
        resultat = major(resultat, num3);

        System.out.println("El número més gran és: " + resultat);
    }
}
