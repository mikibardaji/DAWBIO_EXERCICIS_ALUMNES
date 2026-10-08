/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
 * @author jgu3417
 */

package excondicionals13;

import java.util.Scanner;

public class ExCondicionals13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("De quin color esta el semafor? (V/T/R): ");
        char color = teclado.nextLine().charAt(0);

        if (color == 'V') {
            System.out.println("Pots passar");
        } else if (color == 'T') {
            System.out.println("Espera");
        } else if (color == 'R') {
            System.out.println("Atura't");
        } else {
            System.out.println("Color incorrecte");
        }

        teclado.close();
    }
}
