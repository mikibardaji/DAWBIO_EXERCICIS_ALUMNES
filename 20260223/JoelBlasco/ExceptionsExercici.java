/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jbl3198
 */
public class ExceptionsExercici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercici4();
    
    }
        
    public static void exercici3(){
        try{
            double[] llistadoubles = {3.4,54.2,432.3,2,1};
        
        for (int i = 0; i < 6; i++) {
            System.out.println(llistadoubles[i]);
        }
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    } 
    
    public static void exercici4(){
            int pos = 0;
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int[] llistaints = {rd.nextInt(1,11),rd.nextInt(1,11),rd.nextInt(1,11),rd.nextInt(1,11),rd.nextInt(1,11)};
            do{
            try{
               System.out.print("Que posicion de la lista quieres consultar: ");
                pos = sc.nextInt();
            
                System.out.println("Valor: " + llistaints[pos]);
            }catch(Exception e){
            System.out.println(e.getMessage());
        }    
            }while(pos>0); 
           
    }
}
