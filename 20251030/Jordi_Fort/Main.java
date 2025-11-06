/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30.pkg10_funciones;

import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num1, num2, resultado;
        
        num1 = PedirNumero();
        num2 = PedirNumero();
        
        resultado = producto(num1, num2);
        
        System.out.println("La multiplicacion es: " + resultado);
    }
    
    public static double producto(double x, double y)
    {
            double multi = x * y;
            
            return multi;
    }
    
    public static int PedirNumero()
    {
            Scanner sc = new Scanner(System.in);
            int numero;
            
            System.out.print("Dime un numero para multiplicar: ");
            numero = sc.nextInt();
            
            return numero;
    } 
    
}
