/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 * @author jgu3417
 */
package excondicionals14;

import java.util.Scanner;

public class ExCondicionals14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos euros tienes? ");
        double euros = teclado.nextDouble();

        System.out.println("a - Dolar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");

        teclado.nextLine();

        System.out.print("Esperando opción: ");
        char opcio = teclado.nextLine().charAt(0);

        switch (opcio) {
            case 'a':
                double dolar = euros * 1.17;
                System.out.println("Tienes " + dolar + " dolares");
                break;

            case 'b':
                double libra = euros * 0.87;
                System.out.println("Tienes " + libra + " libras");
                break;

            case 'c':
                double yen = euros * 174.00;
                System.out.println("Tienes " + yen + " yenes");
                break;

            default:
                System.out.println("Opción incorrecta");
        }

        teclado.close();
    }
}
