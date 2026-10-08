/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author bca5802
 */
public class ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double num1;

        System.out.println("Numero 1");
        num1 = sc.nextDouble();

        if (num1 >= 0 && num1 < 3) {
            System.out.println("Molt deficient");
        } else if (num1 >= 3 && num1 < 5) {
            System.out.println("Insuficient");
        } else if (num1 >= 5 && num1 < 6) {
            System.out.println("Suficient");
        } else if (num1 >= 6 && num1 < 7) {
            System.out.println("bé");
        } else if (num1 >= 7 && num1 < 9) {
            System.out.println("Notable");
        } else if (num1 >= 9 && num1 < 10) {
            System.out.println("Excelente");
        }

    }
}
