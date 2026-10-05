/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicionales;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Trabajo8 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        double nota1, nota2;
        System.out.println("Cuanto sacaste en la RA1");
        nota1 = sc.nextDouble();
         System.out.println("Cuando sacaste en la RA2");
        nota2 = sc.nextDouble(); 
        
        double media = (nota1 + nota2) / 2;

if (media <= 4.99) {
    System.out.println("Has de ir a la segunda convocatoria");
} else {
    System.out.println("Has pasado de Modulo, Felicidades");
}

    
}
}
