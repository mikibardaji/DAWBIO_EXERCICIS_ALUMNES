/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9. Programa que demana tres nombres enters i diu quin és el valor més gran. 
        // Implementar un mètode amb el prototip int major(int x, int y) que retorni el valor major de dos.

        int num1, num2, num3, gran, maxim;

        num1 = pedirNumInt(); //Se puede poner en el pedirNumInt("String") y asi modificar la frase aqui i en cada caso.
        num2 = pedirNumInt();
        num3 = pedirNumInt();

        gran = major(num1, num2);

        maxim = major(gran, num3);

        System.out.println("El numero més gran es el: " + maxim + " .");

    }

    public static int pedirNumInt() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introdueix un numero: ");
        int x = lector.nextInt();
        return x;
    }

    public static int major(int x, int y) {
        if (x < y) {
            return y;
        } else {
            return x;
        }
    }

}
