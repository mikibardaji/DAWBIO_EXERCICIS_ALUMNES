/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3numgran;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ex3NumGran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2;
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un número: ");
        num1 = lector.nextDouble();
        System.out.print("Dime otro número: ");
        num2 = lector.nextDouble();
        if(num1>num2){
            System.out.println("El número más grande es: " + num1);
        }
        if(num2>num1){
           System.out.println("El número más grande es: " + num2); 
        }
        else {
            System.out.println("Los números son iguales");
        }
            
        // TODO code application logic here
    }
    
}
