/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicinautiques;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class ExerciciNautiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int MILLA_A_METR0 = 1852;
        double milla, metres;
        Scanner teclat = new Scanner(System.in);
        
        System.out.println(" Cuantas millas has recorrido");
        milla = teclat.nextDouble();
        
        metres = milla * MILLA_A_METR0;
        
        System.out.println(" Has navegado " + metres + "  metros...");
        
    }
    
}
