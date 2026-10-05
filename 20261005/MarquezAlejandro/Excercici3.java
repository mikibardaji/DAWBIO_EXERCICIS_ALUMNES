/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int numero1, numero2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Inserta numero 2: ");
        numero2 = sc.nextInt();
        
        if (numero1 > numero2)
                {
                System.out.println("El numero alto es: " + numero1);
                }
        else {
                System.out.println("El numero alto es: " +numero2);
        }

        
                }
        
        
        
                
        
        
    }
    

