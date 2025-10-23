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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();
        
        int menor = menor(num1, num2);
        
        System.out.println("El numero menor es "+ menor);
        
    }
    public static int menor(int x, int i){
    int menor = 0;
    
    
    if( x > i){
    menor = i;
    } else{
      menor = x;
    } 
   
     return menor;
    }
    
   
}
