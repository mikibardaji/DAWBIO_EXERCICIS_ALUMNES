/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives3;

import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExIteratives3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3. Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.
        Scanner lector = new Scanner(System.in);
        int num;
        int sumador = 2;
        
        System.out.println("Anem a mostrar tots els nombres parells entre el 1 i el que em diguis!");
        System.out.print("Fins a quin numero vols?");
        num = lector.nextInt();
        int i = 2;
        
        while(i <= num){
            System.out.println(i);
            i = i + 2;
                        
        }
        
        System.out.println("Ja estan tots.");
        
    }
    
}
