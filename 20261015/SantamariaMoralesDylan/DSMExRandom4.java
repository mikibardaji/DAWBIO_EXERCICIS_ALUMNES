/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexrandom4;

import java.util.Random;

/**
 *
 * @author dsa1845
 */
public class DSMExRandom4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Llançament d’un dau.
        Random aleatori = new Random();
        
        int dau = aleatori.nextInt(1, 7);
        
        System.out.println("Y el dau treu....");
        
        if (dau == 6){
            System.out.println("Has tret un 6!");
        }else{
            if(dau == 1){
                System.out.println("Quina mala sort... has tret un 1!");
            }else{
                System.out.println("Resultat normal: " + dau);
            }
        }
        
    }
    
}
