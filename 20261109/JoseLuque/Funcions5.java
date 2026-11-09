/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions5;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que demana a l’usuari una distància mesurada en milles i mostra el seu equivalent en quilòmetres (1 milla = 1,6093 km). Ha d’implementar un mètode amb el prototip double millesAKm(int milles)
    Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int milles = lector.nextInt();
        System.out.println("el numero convertit es: " + millesAKm(milles));
    }
 public static double millesAKm(int milles){
   double millesAKm ;
   millesAKm = milles * 1.6093;
return millesAKm;
 }    
}
