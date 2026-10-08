/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciocant;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class PrecioCant {

    /**
     *12. Desarrolle un programa que pida al usuario que introduzca un precio
     * en € y la cantidad de € que paga. El programa comparará las dos cantidades
     * y escribirá los € que le faltan por pagar o bien los que le deben devolver. 
     * Ej. Si el usuario introduce precio=102€ y paga=150€, el programa le dirá “Sobren 48€”.
     * Si el usuario introduce precio=102€ y paga=100€, 
     * el programa le dirá “Falten 2€”.
     */
    public static void main(String[] args) {
        // DECLARAMOS VARIABLES 
        Scanner teclado = new Scanner(System.in);
        double precio;
        double paga;
        
        //escribimos
        //escribimos
        
        
        
        System.out.println("Introduce el precio: ");
        precio = teclado.nextDouble();
        System.out.println("a - Dolar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");
      
        System.out.println("Introduce el pago: ");
        paga = teclado.nextDouble();
        
        
        //if, else if y else
        
        if (paga > precio){
            double sobran = paga - precio;
            System.out.println("Sobran " + sobran + " €");
            
        }else if (paga < precio) { 
            double faltan = precio - paga;
            
            System.out.println("Faltan" + faltan + " €");
        }else{
            System.out.println("No sobra ni falta dinero: ");
        
        //SE PUEDE USAR SWITCH
        }
    }
}
    
    
    
    
    
    
