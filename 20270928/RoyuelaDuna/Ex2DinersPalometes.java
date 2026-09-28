/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.dinerspalometes.java;

import java.util.Scanner;

/**
 *
 * @author dro3858
 */
public class Ex2DinersPalometesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dinersCartera, preuEntrada, preuEntradesTotal, dinersRestants;
        int numEntrades;
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Quants diners tens?");
        //Mostrar "Quants diners"
        dinersCartera = teclat.nextDouble();
        //Esperar
        System.out.println("Quantes entrades has comprat?");
        
        numEntrades = teclat.nextInt();
        
        System.out.println("Quant val una entrada?");
        
        preuEntrada = teclat.nextDouble();
        
        preuEntradesTotal = preuEntrada*numEntrades;
        
        dinersRestants = dinersCartera - preuEntradesTotal;
        
        System.out.println("Et queden" + dinersRestants + "euros");
        
    }
    
}
