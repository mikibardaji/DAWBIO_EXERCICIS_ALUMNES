/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpractica;

import java.util.Scanner;

/**
 *
 * @author xabiel
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float precio = 0, precioConIva = 0;
        char respuesta;

        do {
            precio = preguntarPrecio();
            precioConIva = preuAmbIva(precio);
            mostrar(precio, precioConIva);

            
          
            respuesta = pedirRespuesta();
        } while (respuesta == 's');

      
    }
    
    public static char pedirRespuesta(){
          Scanner sc = new Scanner(System.in);
          System.out.println("¿Desea continuar? (s/n)");
          return sc.next().toLowerCase().charAt(0);
    }
    
    public static void mostrar (float precio, float precioIva){
        System.out.println("Este es el "+precio);
        System.out.println("Este es el precio con iva " +precioIva );
    }
    public static float preguntarPrecio(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un precio");
        return sc.nextFloat();
       }
    public static float preuAmbIva(float preu){
    
    return (float) (preu*1.21);    
    }
    
}
