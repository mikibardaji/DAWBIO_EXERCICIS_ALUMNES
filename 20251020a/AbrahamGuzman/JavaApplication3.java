/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author agu3018
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        double num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        double num2 = sc.nextInt();
        
        double producto = producto(num1, num2);
        System.out.println(num1 +" * "+num2+ " = "+producto);
        
    }
    
    public static double producto(double x, double y){
       return x*y;
             
    }
    
}
