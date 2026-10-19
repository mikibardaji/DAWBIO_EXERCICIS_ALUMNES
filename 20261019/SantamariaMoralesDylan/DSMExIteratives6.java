/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives6;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El programa llegeix 10 valors de tensió arterial (no nuls) i, en acabar, mostra un missatge indicant si s’ha detectat algun valor crític 
        // —és a dir, si algun valor ha estat negatiu, cosa que indicaria un error de mesura o un pacient fictici. 
        Scanner lector = new Scanner(System.in);
        int valor;
        int critic = 0;
        
        System.out.println("Introdueix 10 valors de tensió arterial: ");
        
        for(int i=1; i<=10; i++){
            
            System.out.print("Introdueix valor " + i + ": ");
            valor = lector.nextInt();
            
            if (valor < 0){
                critic = 1;
            }           
            
        }
        if(critic==1){
            System.out.println("S'HA DETECTAR ERROR DE MESURA");
        }else{
            System.out.println("Tots els valors son correctes.");
        }
    }
    
}
