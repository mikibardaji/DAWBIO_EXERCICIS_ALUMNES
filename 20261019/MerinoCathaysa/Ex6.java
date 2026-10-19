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
        int valores;
        
        do {
        
        System.out.print("Dime 10 valores de tensón arterial: ");
        valores = sc.nextInt();
        
        } while(valores < 10);
        
        if (valores < 0) {
            System.out.println("Estos han sido los valores en negativo: " + valores);
        }
        
    }
    
}
