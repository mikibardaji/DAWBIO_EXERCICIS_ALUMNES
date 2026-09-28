/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palometes;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Palometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("Quantitat diners:");
        double diners = lector.nextDouble();
        Scanner lector1 = new Scanner(System.in);
        System.out.println("Quant costa l'entrada? ");
        double preu_entrada = lector1.nextDouble();
        Scanner lector3 = new Scanner(System.in);
        System.out.println("Quantes entrades? ");
        double numero_entrades = lector3.nextDouble();
        double diners_restants = diners - preu_entrada * numero_entrades;
        System.out.println(diners_restants + " €");
        
    }
    
}
