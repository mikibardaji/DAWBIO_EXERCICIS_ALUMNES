/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millasakm;

import java.util.Scanner; //

/**
 * 5. Programa que pide al usuario una distancia medida en millas y muestra 
 * su equivalente en kilómetros (1 milla = 1.6093 km). Debe implementar un 
 * método con el prototipo double millasAKm(int millas).
 * @author iva7943
 */
public class MillasAKm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la distancia en millas: ");
        int millas = sc.nextInt(); 
        
        double kilometros = millasAKm(millas);
        
        System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
    }
    
  
    public static double millasAKm(int millas) {
        double conversion = 1.6093;
        return millas * conversion;  
    }
}