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
public class Trabajo9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Pon tu nota final del modulo");
        nota = sc.nextDouble();
        
        if (nota >= 0 && nota <= 3){
            System.out.println("Un resultado muy deficiente");
        } else if(nota > 3 && nota < 5){
            System.out.println("Nota insuficiente");
        } else if(nota >= 5 && nota <= 7){
            System.out.println("Nota suficiente");
        } else if(nota > 7 && nota < 9){
            System.out.println("Nota notable");
        } else if(nota == 10){
            System.out.println("Nota Excelente");
        } else{
            System.out.println("Nota no valida");
        }
        
    
    }
    
}
