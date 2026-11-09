/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valor1, valor2;
        System.out.println("Dime dos valores y te diré cuál es menor.");
        System.out.println("Dime el primer valor:");
        valor1 = sc.nextInt();
        System.out.println("Dime el segundo valor:");
        valor2 = sc.nextInt();
        
        System.out.println("El de menor valor es: " + esMenor(valor1, valor2));
        
    }
    
    public static int esMenor(int valor1, int valor2){
        
        if (valor1 > valor2) {
            return valor2;
        } else {
            return valor1;
        }
    }
    
}
