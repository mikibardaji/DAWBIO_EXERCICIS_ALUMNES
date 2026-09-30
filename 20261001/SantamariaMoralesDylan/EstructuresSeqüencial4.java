/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuresseqüencial4;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class EstructuresSeqüencial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Cercle i PI
        
        Scanner lector = new Scanner (System.in);
        
        final double PI = 3.14;
        double radi, longitud, area;
        
        System.out.print("Quin es el radi? ");
        radi = lector.nextDouble();
        
        longitud = 2 * PI * radi;
        area = PI * radi * radi;
        
        System.out.println("La longitud de la circumferència és: " + longitud + ", i l'area és: " + area + ".");    
                
        
        
    }
    
}
