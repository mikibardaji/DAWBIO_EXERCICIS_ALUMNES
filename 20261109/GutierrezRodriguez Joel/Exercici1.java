/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercici1;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Exercici1 {

    public static double producte(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double num2 = sc.nextDouble();

        System.out.println("El producte és: " + producte(num1, num2));
    }
}
