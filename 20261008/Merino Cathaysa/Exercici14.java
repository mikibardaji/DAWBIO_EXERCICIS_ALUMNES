/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Exercici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double euros, dolar = 1.13, libra = 0.85, yen = 178.05; 
        int moneda;
        
        System.out.println("¿Cuántos euros tienes?");
        euros = sc.nextDouble();
        
        System.out.println("A qué moneda quieres convertir, elige un número: 1. Dólar, 2. Libra o 3.Yen");
        moneda = sc.nextInt();
        
        switch (moneda) {
            case 1:
                euros = euros * dolar;
                System.out.printf("Son %.2f dólares%n", euros);
                break;
            case 2:
                euros = euros * libra;
                System.out.printf("Son %.2f libras%n", euros);
                break;
            case 3:
                euros = euros * yen;
                System.out.printf("Son %.2f yenes%n", euros);
                break;
        }
        
    }
    
}
