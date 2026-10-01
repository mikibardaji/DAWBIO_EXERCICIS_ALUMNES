/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication.pkg4;
import java.util.Scanner;

/**
 *
 * @author msh6189
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double radi, longitud, area;
       
        System.out.println("Introdueix el radi:");
        radi = sc.nextDouble();
       
        longitud = 2 * Math.PI * radi;
        area = Math.PI * radi * radi;
       
        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
       
       
    }
   
}
