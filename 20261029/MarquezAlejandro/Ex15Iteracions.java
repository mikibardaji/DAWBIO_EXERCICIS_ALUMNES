/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex15iteracions;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex15Iteracions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numtabla;
        
        System.out.println("Dime que tabla de multiplicar quieres: ");
        numtabla = sc.nextInt();
        
        for(int contador = 1; contador <=10; contador++){
            System.out.println(numtabla + " x " + contador + " = " + (numtabla*contador));
        }
        
        
        
    }
    
}
