/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicionales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Trabajo7 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("pedir numero 1");
        numero1 = sc.nextInt();
         System.out.println("pedir numero 2");
        numero2 = sc.nextInt(); 
        System.out.println("Pedir numero 3");
        numero3 = sc.nextInt();
        
        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero 1 es el mayor de todo");
        }else if(numero2 > numero1 && numero2 > numero3) {
            System.out.println("El Numero 2 es el mayor de todos");
                    
        }else{
            System.out.println("El numero 3 es el mayor de todos");
                    
                    }
        }
    
}

