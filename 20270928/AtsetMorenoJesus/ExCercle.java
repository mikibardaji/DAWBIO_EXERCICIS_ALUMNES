/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercle;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExCercle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double longitudRadi, longitudCircum, areaCircum;
        double Pi = 3.14; 
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime la longitud del radio: ");
        longitudRadi = lector.nextDouble();
        longitudCircum = (Pi * 2 * longitudRadi);
        areaCircum = (Pi * longitudRadi*longitudRadi);
        System.out.println("La longitud de la circumferencia es: " + longitudCircum + " y el área es " + areaCircum);
        // TODO code application logic here
    }
    
}
