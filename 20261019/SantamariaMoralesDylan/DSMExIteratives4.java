/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives4;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador sumant d'1 en 1.
                Scanner lector = new Scanner(System.in);
        int num;
          
        System.out.println("Anem a mostrar tots els nombres parells entre el 1 i el que em diguis en forma de llista!");
        System.out.print("Fins a quin numero vols?");
        num = lector.nextInt();
        int i = 2;
        
        while(i <= num){
            if ((i%2)==0){
                System.out.println(i);
            }
            i ++;
                        
        }
        
        System.out.println("Ja estan tots.");
    }
    
}
