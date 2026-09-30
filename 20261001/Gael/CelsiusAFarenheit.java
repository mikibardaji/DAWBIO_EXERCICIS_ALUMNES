/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiusafarenheit;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class CelsiusAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Celsius,Farenheit,Kelvin;
        Scanner lector = new Scanner(System.in); 
        
        System.out.print("Cuantos kelvin? ");
        Kelvin = lector.nextDouble();
        
        Celsius = Kelvin - 273.15;
        System.out.println("Son " + Celsius + "ºC");
        
        Farenheit = (Celsius * 9/5) + 32;
        System.out.println("Això son " + Farenheit + " en Farenheit" );
    }
    
}
