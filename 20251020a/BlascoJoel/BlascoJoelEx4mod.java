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
public class BlascoJoelEx4mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Posa un numero: ");

        int numero1 = sc.nextInt();
        
        System.out.print("El numero " + numero1 + " es ");
        switch(obteSigne(numero1)){
            case 1:
                System.out.println("positiu.");
                break;
            case 0:
                System.out.println("zero.");
                break;
            case -1:
                System.out.println("negatiu.");
                break;
            default:
                System.out.println("ERROR!");
                break;
        }
        
    }

    private static int obteSigne(int x){
        int signe;
        if(x < 0){
            signe = -1;
        }
        else if(x > 0){
            signe = 1;
        }
        else{
            signe = 0;
        }
        return signe;
    }
    
}
