/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millesnàutiquesametres;
import java.util.Scanner;

/**
 *
 * @author gga2951
 */
public class MillesNàutiquesAMetres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millaNautica,resultado;
        int metro;
        metro = 1852;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Quantes milles náutiques? ");
        millaNautica = lector.nextDouble();
        
        resultado = millaNautica * metro;
        
        System.out.println("Total: " + resultado);
        
        }
    
}
