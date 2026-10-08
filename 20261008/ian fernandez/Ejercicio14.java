/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        final double dollar = 1.12;
        
        final double libra = 0.85;
        
        final double yen = 176.87;
        
        System.out.println("Cuanto dinero tienes? ");
        
       double euros = sc.nextDouble();
        
        System.out.println(euros + " euros son " + (euros * dollar) + "dolares");
        
        System.out.println(euros + " euros son " + (euros * libra) + "libras");
        
        System.out.println(euros + " euros son " + (euros * yen) + "yenes");
        
        
    }
    
}
