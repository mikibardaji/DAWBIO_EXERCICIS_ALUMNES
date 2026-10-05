/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.condicionales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        if (edad <= 17 ){
            System.out.println("Eres menor de edad");
        } else{
            System.out.println("Eres mayor de edad");
        }
        
    }
    
}
