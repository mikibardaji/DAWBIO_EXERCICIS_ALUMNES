/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grande;


import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class Grande {

    /**
     *Programa que llegeix dos números i ens 
     *diu quin és el més gran o si són iguals.
     */
    public static void main(String[] args) {
        // declaramos variable
       Scanner lector = new Scanner(System.in);
        int num1;
        int num2;
        
        
        //Escribimos
        System.out.println("Ingresa el primer numero: ");
        num1 = lector.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        num2 = lector.nextInt();
        
        //else if
        if(num1 > num2){
            System.out.println( "El numero mas grande es: " + num1 );
        }else if(num2 > num1){
            System.out.println( "El numero mas grande es: " + num2);
            
        }else{
            System.out.println("Son iguales");
            
        }
        
    
    
    
    
    
    }
    
}
