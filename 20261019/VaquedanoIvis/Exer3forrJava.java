/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer3forr.java;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class Exer3forrJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    Scanner teclado = new Scanner(System.in);

System.out.print("Introdueix N: ");
int N = teclado.nextInt();

for (int i = 2; i <= N; i += 2) {
    System.out.println(i);
}
}
