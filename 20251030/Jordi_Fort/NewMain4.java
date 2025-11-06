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
public class NewMain4 {

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
        int numero;
        
        System.out.print("Dime un numero: ");
        numero = sc.nextInt();
        
        return numero;
    }
    
    /*public static boolean iguales(int x, int y)
    {
        boolean iguales = false;
        
        if (x == y) {
            iguales = true;
        }
        return iguales;
    }*/
    
    public static int comparador(int x, int y)
    {
        int mayor;
        
        if (x < y) {
            mayor = -1;
            
        }else if(x > y){
            mayor = 1;
        
        }else{
            mayor = 0;
        }
        return mayor;
    }
    
    public static void mostrarResultado(int x)
    {
        System.out.println("Reglas:"
                + "\nPrimer numero mayor que el segundo = 1"
                + "\nSegundo numero mayor que el primero = -1"
                + "\nLos dos numeros son iguales = 0");
        
        System.out.println("\nEl resultado es: " + x);
        
    }
    
}
