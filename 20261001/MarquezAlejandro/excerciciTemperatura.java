/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicitemperatura;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class ExerciciTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat =  new Scanner (System.in);
        double kelvin, celsius, farenheit;
        final double KELVIN_CELSIUS = 273.15;
        
        System.out.println("Que temperatura kelvin");
        kelvin = teclat.nextDouble();
        
        celsius = kelvin -KELVIN_CELSIUS;
        farenheit = (double) (celsius*9/5) + 32;
        
        System.out.println("amb celsius es" + celsius);
        System.out.println("amb farenheit es " +  farenheit);
        
        
        
    }
    
}
