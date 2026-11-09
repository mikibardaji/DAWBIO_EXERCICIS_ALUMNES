/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Exercici3 {

    public static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon numero: ");
        int num2 = sc.nextInt();

        System.out.println("El numero menor es: " + menor(num1, num2));
    }
}
