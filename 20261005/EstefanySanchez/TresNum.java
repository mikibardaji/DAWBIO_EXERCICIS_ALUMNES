/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresnum;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class TresNum {

    /**
     * Programa que llegeix tres números diferents 
     * i ens diu quin és el més gran.
     */
    public static void main(String[] args) {
        // declaramos variable
        Scanner lect = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        
        //escribimos
        System.out.println("Num1: ");
        num1 = lect.nextInt();
        System.out.println("Num2: ");
        num2 = lect.nextInt();
        System.out.println("Num3:");
        num3 = lect.nextInt();
        
        //if else
        if(num1 > num2 && num1 > num3){ //el num1 y luego voy haciendo con el siguiente num las comparaciones
            System.out.println("Mas grande: " + num1);
        }else if(num2 > num1 && num2 > num3){ // operadores para compara variar variables en una sola operacion
            System.out.println("Mas grande: " + num2);
        }else{
            System.out.println("mas grande" + num3);
            
        }        
        

        
    }
    
}
