/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner lector = new Scanner(System.in);
         
         final double pi = 3.14;
                 
         System.out.println("Dime el valor del radio del circulo");
         
         double radio = lector.nextDouble();
         
         double longitud = 2 * pi * radio;
         
         System.out.println("la longitud es "+ longitud);
         
         double area = pi * (radio * radio);
         
         System.out.println("el area es "+ area);
         
    }
    
}
