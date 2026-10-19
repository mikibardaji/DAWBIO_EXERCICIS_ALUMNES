/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives2dowhile;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives2DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden.
        Scanner lector = new Scanner(System.in);
        int dosis;
        
        int horesPassats = 1;
        
        System.out.print("Quantes dosis necessites? ");
        dosis = lector.nextInt();
        
        do{
            System.out.println("Dosis administrada, t’en falten " + (dosis-horesPassats) + " hores.");
            horesPassats = horesPassats + 1;
        }while(dosis!=(horesPassats-1));
        
        System.out.println("Ja estas curat!!!");
    }
    
}
