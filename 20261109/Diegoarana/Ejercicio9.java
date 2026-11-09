/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 9. Programa que pide tres números enteros y dice cuál es el valor más grande.
        // Implementar un método con el prototipo int major(int x, int y) que devuelva el valor mayor de dos.
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.println("Introduce tres numeros y te dire cual es el mayor: ");
            System.out.print("Numero 1: ");
            int num1 = lector.nextInt();
            System.out.print("Numero 2: ");
            int num2 = lector.nextInt();
            System.out.print("Numero 3: ");
            int num3 = lector.nextInt();
            
            // Primero comparamos num1 y num2, y despues el ganador con num3
            int mayor12 = major(num1, num2);
            int resultat = major(mayor12, num3);
            
            System.out.println("El numero mayor es: " + resultat + " .");
            
        }catch(InputMismatchException e){
            System.out.println("Tienes que introducir un numero entero.");
        }
        
    }
    
    public static int major(int x, int y){
        int major;
        if (x>y){
            major = x;
        }
        else {
            major = y;
        }
        return major;
    }
    
} 
