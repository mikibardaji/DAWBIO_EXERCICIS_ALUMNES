/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexrandom5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExRandom5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5. Joc de daus
        Random aleatori = new Random();        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Anem a llançar dos daus per apostar");
        System.out.print("Quants diners vols apostar? ");
        double dinersApostats = lector.nextDouble();
        
        int dau1 = aleatori.nextInt(1, 7);
        int dau2 = aleatori.nextInt(1, 7);        
        int resultat = dau1 + dau2;
                        
        if (resultat == 7){
            System.out.println("Bravo! Has guanyat " + dinersApostats + " euros. Havies tret: " + dau1 + ", " + dau2 + ".");
        }else{
            if(dau1 == dau2){
                System.out.println("Has tret doble amb: " + dau1 + ", " + dau2 + " anem a llançar un altre cop...");
                dau1 = aleatori.nextInt(1, 7);
                dau2 = aleatori.nextInt(1, 7);
                
                if(dau1 == dau2){
                    double tripleDinersApostats = dinersApostats * 3;
                    System.out.println("COMBO! Tripliques ganacies, has guanyat " + tripleDinersApostats + " euros. Has tret: "  + dau1 + ", " + dau2 + ".");
                }else{
                    double dobleDinerApostats = dinersApostats * 2;
                    System.out.println("Has doblat el valor: guanyes " + dobleDinerApostats +  " euros. Has tret: "  + dau1 + ", " + dau2 + ".");
                }                 
                
                
            }else{
              System.out.println("Has perdut l'aposta, has tret: " + dau1 + ", " + dau2 + ".");  
            }
        }        
                
        
    }
    
}
