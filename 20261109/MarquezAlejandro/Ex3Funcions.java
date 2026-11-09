/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3funcions;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex3Funcions {

    /**
     * 
     * 3.Programa que demana a l’usuari dos números enters i mostra quin és el menor. 
     * Cal implementar i usar el mètode int menor(int x, int y), 
     * el qual retorna el menor dels dos passats com a paràmetres.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("Dime el numero 1: ");
        num1 = sc.nextInt();

        System.out.println("Dime el numero 2: ");
        num2 = sc.nextInt();

        resultado = menor(num1, num2);

        System.out.println("El numero menor es: " + resultado);

    }

    public static int menor(int x, int y) {

        if (x > y) {
            return y;
        } else {
            return x;
        }

        
    }
    
}
