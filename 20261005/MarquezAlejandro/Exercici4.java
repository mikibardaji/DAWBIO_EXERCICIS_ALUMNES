/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero1;
        
        System.out.println("insertar numero: ");
        numero1 = sc.nextInt();
        
        
        if (numero1>0){
            System.out.println("Tu numero es positivo");
        }
        else if (numero1<0){
            System.out.println("Tu numero es negativo");
        }
        else {
            System.out.println("Tu numero es 0");
        }
    }
        
        
    }
    

