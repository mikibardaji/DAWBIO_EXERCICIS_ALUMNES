/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excambitemperatura;

import java.util.Scanner;
/
/**
 *
 * @author jesus
 */
public class ExCambiTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Kelvin, Celsius, Farenheit;
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriu els graus en Celsius: ");
        Celsius = lector.nextDouble();
        Kelvin = Celsius + 273.15;
        Farenheit = (Celsius*1.8) + 32;
        System.out.println("La conversió a graus kelvins es: " + Kelvin);
        System.out.println("La conversió a graus farenheit es: " + Farenheit);
        // TODO code application logic here
    }
    
}
