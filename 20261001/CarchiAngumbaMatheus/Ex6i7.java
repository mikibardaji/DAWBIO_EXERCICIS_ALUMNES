/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6i7;

import java.util.Scanner;

/**
 *
 * @author mca3765
 */
public class Ex6i7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Dona'm la temperatura en ºKelvin: ");
        double tempKelv = teclat.nextDouble();
        final double KELVCELS = 273.15;
        double tempCels = tempKelv - KELVCELS;
        System.out.println("La teva temperatura en Celsius es " + tempCels );
        double tempFar = (tempCels * 9/5) + 32;
        System.out.println("");
        System.out.println("I en ºFarenheit son " + tempFar );
                
        System.out.print("Genial, ara dona'm una distància en milles nàutiques: ");
        final double MILLESNAUTaMETRES = 1852;
        double distMillesNaut = teclat.nextDouble();
        double distMetres = distMillesNaut * MILLESNAUTaMETRES;
        System.out.println("La teva distància en metres es de: " + distMetres ) ;       
                               // TODO code application logic here
    }
    
}
