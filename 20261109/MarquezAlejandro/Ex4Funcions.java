/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4funcions;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex4Funcions {

    /**
     4.Programa que demana a l’usuari un nombre enter 
     i mostra si és positiu, zero o negatiu. Cal crear 
     el mètode int obteSigne(int x), el qual retorna -1, 0, +1 
     segons el nombre és negatiu, zero o positiu, respectivament.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int num, resultado;

        System.out.println("Dime un numero: ");
        num = sc.nextInt();

        resultado = obteSigne(num);

        if (resultado == 1) 
        {
            System.out.println("El numero es positivo");
        }
        else if (resultado == 0) 
        {
            System.out.println("El numero es cero");
        } 
        
        else 
        {
            System.out.println("El numero es negativo");
        }

    }

    public static int obteSigne(int x) {

        if (x > 0) 
        {
            return 1;
        } 
        
        else if (x == 0) 
        {
            return 0;
        } 
        
        else 
        {
            return -1;
        }
    }
    
}
