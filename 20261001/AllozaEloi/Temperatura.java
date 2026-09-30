/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double kelvin, kelvinacelsius, celsiusafarenheit;
        System.out.println("Inserta temperatura en Kelvin: ");
        kelvin = lector.nextDouble();
        kelvinacelsius = kelvin - 273.15;
        celsiusafarenheit = ((kelvinacelsius * 1.8) + 32);
        String resultadokelvinacelsius = String.format("%.2f", kelvinacelsius);
        String resultadocelsiusafarenheit = String.format("%.2f", celsiusafarenheit);
        System.out.println(kelvin + " graus kelvin son " + resultadokelvinacelsius+" graus celsius, o " +resultadocelsiusafarenheit+ " graus farenheit" );
    }
    
}
