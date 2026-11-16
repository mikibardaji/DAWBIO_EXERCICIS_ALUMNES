/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static double hipotenusa(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer cateto: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el segundo cateto: ");
        double b = sc.nextDouble();

        double resultado = hipotenusa(a, b);

        System.out.println("La hipotenusa es: " + resultado);
    }
}
