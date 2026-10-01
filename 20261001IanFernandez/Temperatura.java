/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        System.out.println("dime la cantidad de grados Kelvin");
        
        double kelvin = lector.nextDouble();
        
        double celsius = kelvin - 273.15;
        
        System.out.println("equivale a "+ celsius + " grados celsius");
        
        double farenheit = (celsius * 9 / 5) + 32;
        
        System.out.println("equivalente a " + farenheit + " grados farenheit");
        
        
        
    }
    
}
