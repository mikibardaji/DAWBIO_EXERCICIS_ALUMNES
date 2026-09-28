/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2dinerspalometes;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2DinersPalometes {

    public static void main(String[] args) {
        double dinersCartera, preuEntrada, preuEntradesTotal,dinersRestants;
        int numEntrades;
        Scanner teclat = new Scanner(System.in);
        //Mostrar “Quants diners tens?”
        System.out.println("Quants diners tens?");
        //Esperar dinersCartera
        dinersCartera = teclat.nextDouble();
        //Mostrar “Quantes entrades has comprat?”
        System.out.println("Quantes entrades has comprat?");
        //Esperar numEntrades
        numEntrades = teclat.nextInt();
        //Mostrar “Quant val una entrada?”
        System.out.println("Quant val una entrada?");
        //Esperar preuEntrada
        preuEntrada = teclat.nextDouble();
        //Calcular preuEntradesTotal = preuEntrada x numEntrades
        preuEntradesTotal = preuEntrada * numEntrades;
        //Calcular dinersRestants = dinersCartera- preuEntradesTotal 
        dinersRestants = dinersCartera - preuEntradesTotal;
        //Mostrar “Et queden “ + diners_restants  
        System.out.println("Et queden " + dinersRestants + " €");
    }
    
}
