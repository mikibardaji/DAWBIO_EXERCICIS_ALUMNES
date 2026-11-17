/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void dibujartriangulo(String carac, int nlineas) {
        for (int i = 1; i <= nlineas; i++) {
            System.out.println(carac.repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num_lineas = 0;
        String caracter;
        System.out.println("Introduzca el caracter que quiere usar : ");
        caracter = lector.nextLine();
        System.out.println("Introduzca el numero de lineas : ");
        num_lineas = lector.nextInt();
        dibujartriangulo(caracter, num_lineas);

    }

}
