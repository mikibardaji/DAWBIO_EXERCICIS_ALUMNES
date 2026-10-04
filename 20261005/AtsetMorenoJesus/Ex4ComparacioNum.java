/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4comparacionum;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ex4ComparacioNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime un número: ");
        num1 = lector.nextDouble();
        if (num1>0){
            System.out.println("Tu número es positivo");
        }
        else if (num1<0){
            System.out.println("Tu número es negativo");
        }
        else {
            System.out.println("Tu número es 0");
        }
    }
    
}
