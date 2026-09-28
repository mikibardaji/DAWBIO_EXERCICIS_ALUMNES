/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeres.palomites;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class PrimeresPalomites {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner (System.in);
        
        double dinersCartera,preuEntrada, preuEntradesTotal, dinersRestants;
        int numEntrades;
        
        System.out.println("Quants diners tens?");
        dinersCartera = lector.nextDouble();
        
        System.out.println ("Quantes entrades has comprat?");
        numEntrades = lector.nextInt();
        
        System.out.println("Quant val una entrada?");
        preuEntrada = lector.nextDouble();
        
        preuEntradesTotal = preuEntrada * numEntrades;
        dinersRestants = dinersCartera - preuEntradesTotal;
        
        System.out.println("Et queden " + dinersRestants + "€");
                
                
        
    }
    
}
