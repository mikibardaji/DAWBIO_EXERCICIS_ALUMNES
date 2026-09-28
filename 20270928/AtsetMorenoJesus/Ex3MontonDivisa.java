/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3montondivisa;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class Ex3MontonDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double montondinero, cambio_euros_dolares, divisa;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el monton de dinero");
        montondinero = lector.nextDouble();
        System.out.print("Que divisa transformamos?");
        divisa = lector.nextDouble();
        cambio_euros_dolares = montondinero*divisa; 
        System.out.println("Tienes " + cambio_euros_dolares + " ");
        
        // TODO code application logic here
    }
    
}
