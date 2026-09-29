/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radio;
import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class Radio {

    /**
     * @param args the command line arguments
     * 
     * 4. Programa que toma como dato de entrada un número que 
     * corresponde a la longitud de un radio 
     * y nos escribe la longitud de la circunferencia, el área del 
     * círculo y el volumen de la esfera que se corresponden con ese radio.
     * 
     * Mostrar introducede el rario
     * Espera radio
     * 
     * Calculamos longitud = 2 * PI * radio
     * area = PI * radio * radio
     * 
     * Mostrar La longitud de la circunferencia es + longitud
     * Mostrar El area del circulo es + area
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        // declaromos variables
        
        final double PI = 3.14;
        double longitudCircunferencia, areaCirculo, radio; //Puedo declar varias variables 
                                                           //teniendo en cuenta los tipos de datos. Y TAMBIEN ASGNAR VALORES
        Scanner lector = new Scanner(System.in);
        
        //Mostrar introduce el radio
        System.out.println("Introduce el radio: ");
        radio = lector.nextDouble();
        
        //calculamos longitud de circunferencia
        longitudCircunferencia = 2 * PI * radio;
        areaCirculo = PI * radio * radio;
        
        //Mostrar la longitud de la ccircunferencia
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia + "\nEl area del circulo es: " + areaCirculo); //\n salto de linea
        
        
        
        
        
        
        
    }
    
}
