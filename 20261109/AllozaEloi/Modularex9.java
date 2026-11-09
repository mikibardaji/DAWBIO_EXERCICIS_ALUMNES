/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularex9;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Modularex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número:");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon número:");
        int num2 = sc.nextInt();

        System.out.print("Introdueix el tercer número:");
        int num3 = sc.nextInt();

        int mayorDos = major(num1, num2);

        int resultado = major(mayorDos, num3);

        System.out.println("El número mayor es: " + resultado);

    }
    public static int major(int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }
    
}
