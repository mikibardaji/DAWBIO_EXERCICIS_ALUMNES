/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Random;

/**
 *
 * @author DIEGO ESTUDIOS
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random aleatori = new Random();
        int dado = aleatori.nextInt(1,7);
        System.out.println("Y el dado saca..");
        if (dado==6){
            System.out.println("Has sacado un 6!");
        }else{
            if(dado==1){
                System.out.println("Que mala suerte...has sacado un 1!");
            }else{
                System.out.println("Resultado normal + dado");
                
            }
        }
                
    }
    
}
