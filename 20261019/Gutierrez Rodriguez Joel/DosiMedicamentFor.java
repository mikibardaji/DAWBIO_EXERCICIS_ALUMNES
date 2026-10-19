/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosimedicamentfor;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class DosiMedicamentFor {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Quantes dosis necessites? ");
        int dosis = lector.nextInt();

        for (int i = dosis; i > 0; i--) {
            System.out.println("Dosis administrada te'n falten " + (i - 1) + "...");
        }

        System.out.println("Ja estas curat!!!");

        lector.close();
    }
}

