/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author bca5802
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            int preu,dinero;
            
        System.out.println("Introduce un precio $");
         preu = sc.nextInt();
         
         
         
         System.out.println("Introduce el dinero que tienes  $");
         dinero = sc.nextInt();
         
         int resultado = dinero - preu; 
         if (preu < dinero ) {
            System.out.println("Te devuelvo "+resultado+ "$");
        } else if (preu > dinero ) {
             System.out.println("Te faltan "+resultado+ "$");
        } else { System.out.println ("Ni te falta ni te sobra"); }
    }
    }

