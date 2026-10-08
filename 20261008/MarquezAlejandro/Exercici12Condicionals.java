/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execici12condicionals;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Execici12Condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        double precio, pago;
        
        System.out.println("Introduce el precio del articulo €:");
        precio = sc.nextDouble();
        
        System.out.println("Introduce la cantidad de dinero que tienes €:");
        pago = sc.nextDouble();
        
        if (pago > precio){
            System.out.println("Sobran: " + (pago - precio) + "€");
        }else if (pago < precio){
            System.out.println("Faltan: " + (precio - pago) + "€");
        }
        else System.out.println("Has pagado el importe correcto!");
        
        
    }
    
}
