/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicis;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BlascoJoelEx2mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix la teva edat: ");

        int edat = sc.nextInt();
        
        if(esMajorEdat(edat) == true){
            System.out.println("Ets major d'edat.");
        }
        else{
            System.out.println("Ets menor, fora!");
        }
        
    }

    private static boolean esMajorEdat(int edat){
        boolean esMajor;
        if(edat < 18){
            esMajor = false;
        }
        else{
            esMajor = true;
        }
        return esMajor;
    }
    
}
