/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millasmetros;

import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class MillasMetros {

    /**
     * @param args the command line arguments
     * 
     * 7. Programa que transforma las millas náuticas a metros.
     * 
     * Pseudocodigo
     * Definicion de constante y variables
     * Constate MILLAS_A_METROS = 1852;
     * distanciaEnMillas, distanciaEnMetros
     * 
     * Pedimos escribir entra la distancia en millas:
     * leer distanciaEnMillas
     * 
     * Calculamos
     * distanciaEnMetros = distanciaEnMillas * MILLES_A_METRES
     * 
     * Pedimos escribir distanciaEnMillas, "millasn equivalen a " + distanciaEnMetros
     * + "metros";
     * 
     * 
     */
    public static void main(String[] args) {
        // declaramos variables
        final double MILLAS_A_METROS = 1852;
        double distanciaEnMillas;
        double distanciaEnMetros;
        
        Scanner lector = new Scanner(System.in);
        
        //Escribimos millas
        System.out.println("Entra la distancia en millas: ");
        distanciaEnMillas = lector.nextDouble();
        
        //calculamos
        distanciaEnMetros = distanciaEnMillas * MILLAS_A_METROS;
        
        //escribimos
        System.out.println(distanciaEnMillas + "Millas equivalen a: " + distanciaEnMetros + " metros.");
        
        
        
        
    }
    
}
