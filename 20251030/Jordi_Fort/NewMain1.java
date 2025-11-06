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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2,resultado;
        
        num1 = pedirNumero();
        num2 = pedirNumero();
        
        resultado = comparador(num1,num2);
        
        mostrarResultado(resultado);
        
       
    }
    
    public static int pedirNumero()
    {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 1;
        
        System.out.print("Dime el " + "º numero:");
        numero = sc.nextInt();
        
        while (numero < 0) {
            System.out.println("El numero debe ser positivo");
            numero = sc.nextInt();
        }
        contador++;
        
        return numero;
    }
    
    public static int comparador(int x, int y)
    {
        int menor = x;
        if (x-y >0) {
            menor = y;
        }
        return menor;
    }
    
    public static void mostrarResultado(int x)
    {
        System.out.println("El numero menor es: " + x);
    }
    
}
