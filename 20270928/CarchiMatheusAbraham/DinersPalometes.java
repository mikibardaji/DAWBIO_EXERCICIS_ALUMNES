/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinerspalometes;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class DinersPalometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Entra el diners que tens:");
        double dinersPerEntrades = lector.nextDouble();
        System.out.print("Entra el preu per entrada:");
        double preuEntrada = lector.nextDouble();
        System.out.print("Quantes entrades vols comprar?:");
        int numEntrades = lector.nextInt();
        double dinersRestants = dinersPerEntrades - (preuEntrada * numEntrades);
        System.out.println("Et queden " + dinersRestants + " € per crispetes!");
        // TODO code application logic here
    }
    
}
