/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio15 {

    public static boolean desigualdad(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int c = sc.nextInt();

        if (desigualdad(a, b, c)) {
            System.out.println("Los numeros cumplen la desigualdad triangular.");
        } else {
            System.out.println("Los numeros NO cumplen la desigualdad triangular.");
        }
    }
}
