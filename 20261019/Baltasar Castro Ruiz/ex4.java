/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author bca5802
 */
public class ex4 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
          System.out.println("Dame un numero: ");
          int num1 = s.nextInt();
         
          int num2 = 1;
          
          int i = 1; 
        while (i <= num1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++; 
        }
    }
}

