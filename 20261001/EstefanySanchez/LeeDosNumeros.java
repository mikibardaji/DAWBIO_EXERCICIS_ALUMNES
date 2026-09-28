/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leedosnumeros;

import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class LeeDosNumeros {

    /**
     * @param args the command line arguments
     * 
     * Mostrar Introduce el primer numero
     * Esperar valor1
     * 
     * Mostrar Introduce el segundo numero
     * Esperar valor2
     * 
     * suma valor1 + valor 2
     * resta valor1 - valor2
     * producto valor1 * valor2
     * division valor1 / valor2
     * 
     * Mostrar la suma es + suma
     * Mostrar la resta + resta
     * Mostrar el producto + producto
     * Mostrar división + división
     * 
     */
    public static void main(String[] args) {
        // Declaramos variables
        int valor1;
        int valor2;
        double producto;
        double division;
        double suma;
        double resta;
        
        Scanner lector = new Scanner(System.in);
        
        
        //Pedir valor1
        System.out.println("Introduce el primer valor: ");
        valor1 = lector.nextInt();
        
        //Pedir valor2
        System.out.println("Introduce el segundo valor: ");
        valor2 = lector.nextInt();
        
        
        //Calculamos
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        division = (double)valor1 / valor2;
        producto = valor1 * valor2;
        
        //Mostramos
        System.out.println("Muestra la suma:" + suma);
        System.out.println("Muestra la resta:" + resta);
        System.out.println("Muestra la division: " + division);
        
        
        
        
        
        
        
        
        
        



        
        
        
    
    
    
    
    
    
    
    
    
    }
    
}
