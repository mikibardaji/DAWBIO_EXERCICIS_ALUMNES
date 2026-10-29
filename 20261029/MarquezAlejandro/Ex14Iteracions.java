/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14iteracions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex14Iteracions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        
        int numalt, numusr, numintents=0;
        
        numalt = rd.nextInt(1, 101);
        
        do {
            System.out.println("Adivina el numero del 1 al 100");
            numusr = sc.nextInt();
            numintents = numintents +1;
            
            if (numusr < numalt){
                System.out.println("El numero es mayor");
            }
            else if(numusr > numalt){
                System.out.println("El numero es menor");
            }
        }
        
        while(numusr != numalt);
      {
        System.out.println("Advinaste era el numero " + numalt);
        System.out.println("Haz hecho: " + numintents + " intentos");
      }
        
        
        
    }
    
}
