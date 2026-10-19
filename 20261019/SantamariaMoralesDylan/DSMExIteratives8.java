/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives8;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8.Mostra per pantalla una cadena de 20 lletres alternant A i T (adenina i timina): ATATATATATATATATATAT
        Scanner lector = new Scanner (System.in);
        int pantalles;
        
        System.out.println("Per pantalla mostrare una cadena de 20 lletras alternant A i T (adenina i timina).");
        System.out.print("Quantes pantalles vols? ");
        pantalles = lector.nextInt();
        
        for (int i = 1; i<=pantalles; i++){
            System.out.println("Cadena " + i + " : ATATATATATATATATATAT");
        }
    }
    
}
