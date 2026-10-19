/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex6 {
    
    public static void main(String[] args) {
        
        /*
        El programa llegeix 10 valors de tensió arterial (no nuls) i, 
        en acabar, mostra un missatge indicant si s’ha detectat algun 
        valor crític —és a dir, si algun valor ha estat negatiu, cosa 
        que indicaria un error de mesura o un pacient fictici. 
        */
        
        Scanner sc = new Scanner(System.in);
       
        boolean hayNegativo = false;
        int valores;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce 10 valores de tensión arterial");
            valores = sc.nextInt();
            
            if (valores < 0) {
                hayNegativo = true;
            }
        }
        if (hayNegativo) {
            System.out.println("Hay algún número negativo.");
        } else {
            System.out.println("Todos los números son positivos");
        }
        
    }
    
}

