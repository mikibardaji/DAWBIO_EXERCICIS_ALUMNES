/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer3while.java;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class Exer3whileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

System.out.print("Introdueix N: ");
int N = teclado.nextInt();

int i = 2;

while (i <= N) {
    System.out.println(i);
    i += 2;
}
    }
    
}
