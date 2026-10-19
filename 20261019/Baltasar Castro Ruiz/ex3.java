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
public class ex3 {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Dame un numero: ");
          int num1 = s.nextInt();
         
          int num2 = 2;
          
          while (num2 <= num1){
              System.out.println("Los pares son" +num2);
              num2 += 2;
          }
    }
}
