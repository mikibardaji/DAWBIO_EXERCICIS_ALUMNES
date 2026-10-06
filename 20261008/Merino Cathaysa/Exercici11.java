/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*11. Programa que calcula el salari net mensual d'un treballador 
    en funció del nombre d'hores treballades i la taxa d'impostos d'acord 
    amb les hipòtesis següents:

    • Les primeres 130 hores es paguen a tarifa normal (15,00 €/h).
    • Les hores que passin de 130 es paguen a 1,5 vegades la tarifa normal.
    • Les taxes d'impostos són:
    ◦ Els 500 primers euros són lliures d'impostos.
    ◦ Els 400 següents tenen un 25% d'impostos.
        */
    Scanner sc = new Scanner(System.in);
    
    double horasTrabajadas, salarioBruto, salarioNeto, impuestos;
    
        System.out.println("Dime las horas que has trabajado:");
        horasTrabajadas = sc.nextDouble();
       
        
        if (horasTrabajadas <= 130) {
           salarioBruto = horasTrabajadas * 15;
            
        } else {
            salarioBruto = (130*15) + ((horasTrabajadas -130) * (15 * 1.5));
        } 
        
        if (salarioBruto <= 500) {
            impuestos = 0;

        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;

        } else {
            impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }
        salarioNeto = salarioBruto - impuestos;
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario neto: " + salarioNeto);
    }   
    
}
