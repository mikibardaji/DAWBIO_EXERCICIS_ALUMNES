package ejercicios.condicionales;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumne
 */
public class Trabajo2 {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("pedir numero 1");
        numero1 = sc.nextInt();
        System.out.println("Pedir numero 2");
        numero2 = sc.nextInt();
        
        
        
        if (numero1 >= numero2){
        System.out.println("El numero uno es mas grande");
        
        }else{
            System.out.println("El numero dos es mas grande");
            }
    
    }
    
  
    
}
