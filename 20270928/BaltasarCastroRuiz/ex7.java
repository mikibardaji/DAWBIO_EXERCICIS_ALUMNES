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
public class ex7 {
    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
            int num1,num2,num3;
            
        System.out.println("Numero 1");
         num1 = sc.nextInt();
         
         
         
         System.out.println("Numero 2");
         num2 = sc.nextInt();
         
         
          System.out.println("Numero 3");
         num3 = sc.nextInt();
         
         
         if (num1 > num2 && num1 > num3 ) {
            System.out.println(num1+" Es el mas grande");
        } else if (num2 > num1 && num2 > num3 ) {
             System.out.println(num2+ " Es el mas grande" );
        } else { System.out.println (num3+ " Es el mas grande"); }
    }
    
}
