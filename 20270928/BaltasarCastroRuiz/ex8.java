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
public class ex8 {
    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
            float num1,num2;
            
        System.out.println("Numero 1");
         num1 = sc.nextFloat();
         
         
         
         System.out.println("Numero 2");
         num2 = sc.nextFloat();
         
         
         if (num1 < 5 || num2 < 5) {
             System.out.println("Suspendido crack");}
             else {
             System.out.println("Aprobado");
             }
        }
    }

