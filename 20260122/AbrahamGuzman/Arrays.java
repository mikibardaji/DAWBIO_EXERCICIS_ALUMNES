/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author xabiel
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        
        System.out.println("Introduce 10 números reales:");
        
        // Pedir 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        // Mostrar todos los valores
        System.out.println("\nLos números introducidos son:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        
        
        double suma = 0;
        
        System.out.println("Introduce 10 números reales:");
        
        // Pedir y sumar los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            suma += numeros[i];
        }
        
        // Mostrar la suma total
        System.out.println("\nLa suma de todos los números es: " + suma);
        
            System.out.println("Introduce 10 números reales:");
        
        // Pedir los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        // Inicializar máximo y mínimo con el primer elemento
        double maximo = numeros[0];
        double minimo = numeros[0];
        
        // Buscar máximo y mínimo
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        
        // Mostrar resultados
        System.out.println("\nValor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        
         int[] numerosInt = new int[20];
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        
        System.out.println("Introduce 20 números enteros:");
        
        // Pedir 20 números enteros
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            // Sumar según sea positivo o negativo
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
            // El 0 no se suma en ningún caso
        }
        
        // Mostrar resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Suma de números positivos: " + sumaPositivos);
        System.out.println("Suma de números negativos: " + sumaNegativos);
        
        
    }

    
}
