/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalex12;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Condicionalex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double preuProducte, abonament, faltant, sobrant;
        System.out.print("Instrodueix preu del producte: ");
        preuProducte = lector.nextDouble();
        System.out.print("Introdueix quantitat abonada: ");
        abonament = lector.nextDouble();
        
        if (preuProducte > abonament) {
            faltant = preuProducte - abonament;
            System.out.println("Falten " +faltant +"€");
        }else {
            sobrant = abonament - preuProducte;
            System.out.println("Sobren " + sobrant + "€");
        }
        
    }
    
}
