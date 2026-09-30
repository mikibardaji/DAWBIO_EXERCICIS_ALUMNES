/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuresseqüencials6;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class EstructuresSeqüencials6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6. Graus Kelvin a Celsius i a Farenheit.
        
        Scanner lector = new Scanner (System.in);
        
        final double KelvinCelsius = 273.15;
        double grausKelvin, grausCelsius, grausFarenheit;
        
        System.out.print("Introdueix graus Kelvin: ");
        grausKelvin = lector.nextDouble();
        
        grausCelsius = grausKelvin - KelvinCelsius;
        
        grausFarenheit = (grausCelsius * 9/5) + 32;
        
        System.out.println("En graus Celsius són: " + grausCelsius + "ºC" + ", i passats a Farenheit són: " + grausFarenheit + "ºF.");
                
    }
    
}
