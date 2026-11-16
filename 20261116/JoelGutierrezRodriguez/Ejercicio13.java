/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio13 {

    public static void triangulo(char caracter, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un caracter: ");
        char caracter = sc.next().charAt(0);

        System.out.print("Introduce el numero de lineas: ");
        int lineas = sc.nextInt();

        triangulo(caracter, lineas);
    }
}
