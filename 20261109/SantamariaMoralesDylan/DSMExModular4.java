/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. Programa que demana a l’usuari un nombre enter i mostra si és positiu, zero o negatiu. 
        // Cal crear el mètode int obteSigne(int x), el qual retorna -1, 0, +1 segons el nombre és negatiu, zero o positiu, respectivament.
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.print("Introdueix un numero i et dire que es: ");
            int x = lector.nextInt();
            
            int signe = obteSigne(x);
            
            if (signe == 1){
                System.out.println("El valor " + x + " es positiu" + " (" + signe + ")" + ".");
            }
            else if (signe == 0){
                System.out.println("El valor " + x + " es zero" + " (" + signe + ")" + ".");
            }
            else{
                System.out.println("El valor " + x + " es negatiu" + " (" + signe + ")" + ".");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Has d'introduir un nombre enter.");
        }
    }
    
    public static int obteSigne(int x){
        int signe;
        if (x < 0){
            signe = -1;
        }
        else if(x==0){
            signe = 0;            
        }
        else{
            signe = 1;
        }
        return signe;
    }
    
}
