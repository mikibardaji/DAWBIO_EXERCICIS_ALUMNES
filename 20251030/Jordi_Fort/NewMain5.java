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
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio;
        do {
            precio = pedirArticulos();
            System.out.println("Precio con IVA: " + precioIVA(precio));
        } while (precio != 0);
        System.out.println("Programa terminado");
    }
    
    
    public static int pedirArticulos()
    {
        Scanner sc = new Scanner(System.in);
        int precio;
        
        System.out.println("Introduce el precio del articulo: ");
        precio = sc.nextInt();
        
        return precio;
    }
    
    public static float precioIVA(int precio)
    {
        float precioiva = 1.21f;
        
        return precioiva *= precio;
    }
    
}
