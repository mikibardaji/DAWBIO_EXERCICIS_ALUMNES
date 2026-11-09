/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iva;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class IVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float precio;
        char continuar;

        do {
            System.out.print("Introduce el precio de los articulos: ");
            precio = sc.nextFloat();

            System.out.println("El precio con IVA (21%) es de: " + precioIva(precio) + " €");

            System.out.print("Quieres introducir un precio mas? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa finiquitado.");
    }
    public static float precioIva(float precio){
        return precio * 1.21f;
    }
}
