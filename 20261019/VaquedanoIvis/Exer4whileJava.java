/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer4while.java;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class Exer4whileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

System.out.print("Introdueix N: ");
int N = teclado.nextInt();

int i = 1;

while (i <= N) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
    i++;
}
    }
    
}
