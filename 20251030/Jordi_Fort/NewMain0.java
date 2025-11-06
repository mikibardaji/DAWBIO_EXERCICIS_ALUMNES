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
public class NewMain0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int edad;
        boolean mayorEdad;
        
        edad = pedirEnteroPositivo();
        mayorEdad = esMayorEdad(edad);
        
        mostrarMayorEdad(mayorEdad);
          
    }
    
    public static int pedirEnteroPositivo()
    {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Dime el tu edad: ");
        numero = sc.nextInt();
        
        while (numero < 0) {
            System.out.println("Tu edad no puede ser menor que 0");
            System.out.print("Vuelve a introducir tu edad: ");
            numero = sc.nextInt();
        }
        
        return numero;
    } 
    
    public static boolean esMayorEdad( int edad)
    {
        boolean esMajorEdad;
        
        if (edad >= 18) {
            esMajorEdad = true;
        }else{
            esMajorEdad = false;
        }
        
        return esMajorEdad;
    }
    
    public static void mostrarMayorEdad(boolean mayorEdad)
    {
        String mensaje;
        
        if (mayorEdad) {
            mensaje = "Eres mayor de edad";
        }else{
            mensaje = "No eres mayor de edad";
        }
        System.out.println(mensaje);
    }
    
}
