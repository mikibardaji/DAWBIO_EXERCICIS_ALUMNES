/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author msh6189
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double num1, num2;
        double suma, resta, producte, divisió;
       
        System.out.println("Introdueix el primer número:");
        num1 = sc.nextDouble();
       
        System.out.println("Introduiex el segon número:");
        num2 = sc.nextDouble();
       
        suma = num1 + num2;
        resta = num1 - num2;
        producte = num1 * 2;
        divisió = num1 / num2;
       
        System.out.println("Suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("producte: " + producte);
        System.out.println("divisió: " + divisió);
       

    }
   
}
