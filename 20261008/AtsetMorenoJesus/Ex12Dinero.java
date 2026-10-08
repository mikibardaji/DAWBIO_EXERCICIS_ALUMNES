/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exdinero;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double precio, pago;
        System.out.print("Introduce el precio del producto: ");
        precio = lector.nextDouble();
        System.out.print("Introduce lo que vas a pagar por el: ");
        pago = lector.nextDouble();
        double vuelta = pago - precio;
        double debes = precio - pago;
        if(precio < pago){
            System.out.println("Te deben: "+ vuelta);
        }
        else if(precio > pago){
            System.out.println("Debes: "+ debes);
        }
        else {
            System.out.println("No debes nada"); 
        }
        
    }
    
}
