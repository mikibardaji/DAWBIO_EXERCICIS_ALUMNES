/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosimedicamentwhile;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class DosiMedicamentWhile {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Quantes dosis necessites? ");
        int dosis = lector.nextInt();

        while (dosis > 0) {
            dosis--;
            System.out.println("Dosis administrada te'n falten " + dosis + "...");
        }

        System.out.println("Ja estas curat!!!");

        lector.close();
    }
}

