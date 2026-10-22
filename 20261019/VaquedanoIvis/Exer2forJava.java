/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer2for.java;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class Exer2forJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introdueix un número natural: ");
        int N = teclado.nextInt();

        for (int i = 2; i <= N; i = i + 2) {
            System.out.println(i);
        }
    }
}

    }
    
