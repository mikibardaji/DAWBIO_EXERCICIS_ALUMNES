/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuresseqüencials7;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class EstructuresSeqüencials7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 7. Milles nàutiques a metres.
        
        Scanner lector = new Scanner(System.in);

        final double MillaNauticaMetres = 1852;
        double millesNautiques, metres;
        
        System.out.print("Introdueix les milles nàutiques per passar-ho a metres: ");
        millesNautiques = lector.nextDouble();
        
        metres = millesNautiques * MillaNauticaMetres;
        
        System.out.println("Són: " + metres + " metres.");
    }
    
}
