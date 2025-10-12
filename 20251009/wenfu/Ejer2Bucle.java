/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2bucle;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejer2Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         *     2. Dosi de medicament
Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden
Fes un programa que mostri un missatge per cada hora:
        ◦ Quantes dosis necessites? 6
        ◦ Dosis administrada t’en falten 5…
        ◦ Dosis administrada t’en falten 4…
        ◦ ...
        ◦ Dosis administrada t’en falten 0…
                • Ja estas curat!!!
         */
        Scanner sc = new Scanner(System.in);
        int dosis;
        
        System.out.println("cuantas dosis necesitas?");
            dosis = sc.nextInt();
        
        for (int i = dosis - 1; i >= 0; i--) {
            System.out.println("Dosis administrada t’en falten " + i);
        }
        System.out.println("Ja estas curat!!!");
    }
    
}
