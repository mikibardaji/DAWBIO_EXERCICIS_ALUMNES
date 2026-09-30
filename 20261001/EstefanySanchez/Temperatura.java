/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     * 
     * 6. Programa que lea un valor correspondiente a una temperatura en
     * grados Fahrenheit y escriba la temperatura en grados Celsius
     * 
     * Pseudocodigo:
     * Declamos variables
     * tempF y tempC
     * 
     * Escribir "Introduce la temperatura en grados Fahrenheit: "
     * leer tempF
     * 
     * calculamos
     * tempC = (tempF - 32) * 5/9
     * 
     * Escribir "la temperatura en grados celsius es: " + tempC
     * 
     */
    public static void main(String[] args) {
        // declaramos variable
        int tempF;
        double tempC;
        
        Scanner lector = new Scanner(System.in);
        
        //pedimos temperatura Fahrenheit
        System.out.println("Introduce la temperatura en grados Fahrenheit: ");
        tempF = lector.nextInt();
        
        //calculamos
        tempC = (tempF - 32) * 5 / 9;
        
        //pedimos la temp en º Celsius
        System.out.println("La temperatura en grados celsius es: " + tempC);
        
        
        
        
        
    
    
    
    
    
    
    }
    
}
