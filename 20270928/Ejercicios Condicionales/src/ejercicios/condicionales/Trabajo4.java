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
public class Trabajo4 {
    
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int numero1, numero2;
        System.out.println("pedir numero 1");
        numero1 = sc.nextInt();
        
        
        if (numero1 >= 1){
        System.out.println("Positiu");
        
        }else if (numero1 == 0)
        {
            System.out.println("El numero es Zero");
        }
        else{
            System.out.println("Negatiu");
            }
    
    }
    
    
}
