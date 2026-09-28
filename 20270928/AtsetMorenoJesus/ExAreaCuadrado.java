/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exareacuadrado;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExAreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ladoCuadrado, areaCuadrado;
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime cuanto mide un lado de un cuadrado: ");
        ladoCuadrado = lector.nextDouble();
        areaCuadrado = ladoCuadrado*ladoCuadrado;
        System.out.println("El área del cuadrado es " + areaCuadrado);
        
        // TODO code application logic here
    }
    
}
