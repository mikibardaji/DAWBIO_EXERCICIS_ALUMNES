/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional13.pkg14.pkg15;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Condicional131415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    double costa , pagat, queda;
    System.out.println("Quants euros costa el producte? ");
    costa = lector.nextDouble();
    System.out.println("Quant euros has pagat? ");
    pagat = lector.nextDouble();
    queda = pagat - costa;
    if (queda>=0) {
        System.out.println("T'han de tornar "+ queda + " euros." );
    } else {
        System.out.println("Et falten per pagar " + (queda*-1) + " euros :( !!");
    }
    
        
        


// TODO code application logic here
    }
    
}
