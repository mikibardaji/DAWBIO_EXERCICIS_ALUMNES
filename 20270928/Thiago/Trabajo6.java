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
public class Trabajo6 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int numero1, numero2;
        System.out.println("pedir numero 1");
        numero1 = sc.nextInt();
         System.out.println("pedir numero 2");
        numero2 = sc.nextInt();  
        
        if (numero1 > numero2){
        System.out.println("El numero 1 es mas grande " + numero1);
        
        }else if (numero1 == numero2)
        {
            System.out.println("El numero 1 y 2 son iguales");
        }
        else{
            System.out.println("El numero 2 es mas grande " + numero2);
        
    
}
    }
}
