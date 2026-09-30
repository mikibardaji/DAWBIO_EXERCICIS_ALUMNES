/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cercle;

import java.util.Scanner;

/**
 *
 * 
 */
public class Cercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double longRadiCirc, longCirc, areaCirc;
        System.out.println("Inserta longitud del radi de la circumferencia: ");
        longRadiCirc = lector.nextDouble();
        longCirc = 2 * 3.141592 * longRadiCirc;
        areaCirc = 3.141592 * longRadiCirc * longRadiCirc;
        System.out.println("La longitud de la circumferencia es "+longCirc+ "i l'area es "+areaCirc);
    }
    
}
