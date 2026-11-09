/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Exercici6 {

    public static int compara(int x, int y) {
        if (x < y) {
            return -1;
        } else if (x == y) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon numero: ");
        int num2 = sc.nextInt();

        int resultat = compara(num1, num2);

        if (resultat == 0) {
            System.out.println("Els numeros son iguals");
        } else if (resultat == -1) {
            System.out.println("El numero mes gran es: " + num2);
        } else {
            System.out.println("El numero mes gran es: " + num1);
        }
    }
}
