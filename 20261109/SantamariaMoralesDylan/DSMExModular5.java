/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5.Programa que demana a l’usuari una distància mesurada en milles i mostra el seu equivalent en quilòmetres (1 milla = 1,6093 km). 
        // Ha d’implementar un mètode amb el prototip double millesAKm(int milles).
        Scanner lector = new Scanner (System.in);
        
        int milles;
        double km;
        
        try{
            System.out.print("Introdueix milles per pasar-ho a Km: ");
            milles = lector.nextInt();
            km = millesAKm(milles);
            System.out.println("Son: " + km + " Km.");
            
            
        }catch(InputMismatchException e){
            System.out.println("Has d'escriure un numero en milles.");
        }
    }
    
    public static double millesAKm(int milles){
        double km = milles * 1.6093;
        return km;
    }
    
}
