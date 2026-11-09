/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nummenor;

import java.util.Scanner;

/**
 *
 * @author iva7943
 */
public class Nummenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextInt();
         int resultado = menor(num1, num2);
         
         System.out.println("El numero menor es: " + menor(num1, num2));

    }

    public static int menor(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;

        }

    }
}
