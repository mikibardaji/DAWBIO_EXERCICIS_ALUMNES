/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosidemedicament;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Dosidemedicament {

    /**
     * Programa que simula la presa de dosis d'un medicament
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.print("Quantes dosis necessites? ");
        int dosis = lector.nextInt();
        for (int i = dosis - 1; i >= 0; i--) {
            System.out.println("Ja estas curat!!!");
        }
        
    }
    
}
