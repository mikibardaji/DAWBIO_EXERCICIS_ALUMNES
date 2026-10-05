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
public class Trabajo10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, tiempo;
        System.out.println("Introduce las horas:");
        horas = sc.nextInt();

        System.out.println("Introduce los minutos:");
        minutos = sc.nextInt();

        System.out.println("Introduce los segundos:");
        segundos = sc.nextInt();

        System.out.println("Introduce el tiempo en segundos:");
        tiempo = sc.nextInt();
        
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        totalSegundos = totalSegundos + tiempo;
        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;



        
    }
    
}
