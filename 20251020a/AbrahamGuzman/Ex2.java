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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        
        if(!(EsMayor(edad))){
            System.out.println("No eres mayor "+edad);
        } else {
            System.out.println("Eres mayor");
        }
        
    }
    public static boolean EsMayor (int edat){
      return edat >=18;
    }
}
