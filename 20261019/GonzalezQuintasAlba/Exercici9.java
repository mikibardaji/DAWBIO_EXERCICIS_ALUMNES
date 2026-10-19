/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ago4635
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pulsacio;
        // 9.	Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts, i calcula la mitjana. Valores aleatorios entre 30 y 150.
        Random aleatori=new Random();
        float suma=0;
        for (int i=0;i<5;i++){
            pulsacio=aleatori.nextFloat(30,151);
            System.out.println("Medida : "+ (i+1)+ "es : " + pulsacio);
            System.out.println(pulsacio);
            suma=pulsacio+suma;
            
        }
        System.out.println("La media de las 5 medidas por minuto es "+(suma/5));
    }
    
}
