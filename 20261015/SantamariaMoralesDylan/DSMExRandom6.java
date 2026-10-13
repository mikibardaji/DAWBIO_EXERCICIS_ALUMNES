/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexrandom6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExRandom6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6. Pedra / Paper / Tisora
        Random aleatori = new Random();        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Anem a jugar al pedram paper o tisora contra la maquina.");
        System.out.print("Tria entre un numero (0-Pedra, 1-Paper, 2-Tisora): ");
        int seleccionat = lector.nextInt();
        
        int seleccionatMaquina = aleatori.nextInt(3);
        
        switch(seleccionat){
            case 0:
                if(seleccionatMaquina==0){
                    System.out.println("Tu has triat: Pedra");
                    System.out.println("L'ordinador ha triat: Pedra");
                    System.out.println("Resultat: Empat!");
                }else{
                    if(seleccionatMaquina==1){
                        System.out.println("Tu has triat: Pedra");
                        System.out.println("L'ordinador ha triat: Paper");
                        System.out.println("Resultat: Ha guanyat l'ordinador!");
                    }else{
                        System.out.println("Tu has triat: Pedra");
                        System.out.println("L'ordinador ha triat: Tisora");
                        System.out.println("Resultat: Has guanyat tu!");                        
                    }                    
                }
                break;
            case 1:
                if(seleccionatMaquina==0){
                    System.out.println("Tu has triat: Paper");
                    System.out.println("L'ordinador ha triat: Pedra");
                    System.out.println("Resultat: Has guanyat tu!");
                }else{
                    if(seleccionatMaquina==1){
                        System.out.println("Tu has triat: Paper");
                        System.out.println("L'ordinador ha triat: Paper");
                        System.out.println("Resultat: Empat!");
                    }else{
                        System.out.println("Tu has triat: Paper");
                        System.out.println("L'ordinador ha triat: Tisora");
                        System.out.println("Resultat: Ha guanyat l'ordinador!");                        
                    }                    
                }
                break;
            case 2:
                if(seleccionatMaquina==0){
                    System.out.println("Tu has triat: Tisora");
                    System.out.println("L'ordinador ha triat: Pedra");
                    System.out.println("Resultat: Ha guanyat l'ordinador!");
                }else{
                    if(seleccionatMaquina==1){
                        System.out.println("Tu has triat: Tisora");
                        System.out.println("L'ordinador ha triat: Paper");
                        System.out.println("Resultat: Has guanyat tu!");
                    }else{
                        System.out.println("Tu has triat: Tisora");
                        System.out.println("L'ordinador ha triat: Tisora");
                        System.out.println("Resultat: Empat!");                        
                    }                    
                }
                break;
            default:
                System.out.println("Numero no valid, has d'escollir entre 0 y 2, y no: " + seleccionat + ".");
        }
        
        
       
        
        
    }
    
}
