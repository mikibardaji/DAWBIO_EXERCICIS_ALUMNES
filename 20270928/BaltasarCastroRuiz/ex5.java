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
public class ex5 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int numero1,numero2;
            
        System.out.println("Numero 1");
         numero1 = sc.nextInt();
         
         
         
         System.out.println("Numero 2");
         numero2 = sc.nextInt();
         
         if (numero1 <= numero2) {
            System.out.println(numero1 + " " + numero2);
        } else {
            System.out.println(numero2 + " " + numero1);
        }

    }
         
        
    }


