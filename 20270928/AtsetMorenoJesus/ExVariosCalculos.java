/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exvarioscalculos;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExVariosCalculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor1, valor2, suma, resta, producto, division;
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un primer valor: ");
        valor1 = lector.nextDouble();
        System.out.print("Dime un segundo valor: ");
        valor2 = lector.nextDouble();
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        producto = valor1 * valor2;
        division = valor1/valor2;
        System.out.println("Esta es la suma de los dos valores " + suma + " la resta es " + resta + " el producto es " + producto + " y la división es " + division);
        
        // TODO code application logic here
    }
    
}
