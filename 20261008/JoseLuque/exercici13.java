/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);                    
        System.out.print("En quin color esta el semafor? Posa una de les següents lletres (V-Verd / T-Taronja / R-Roig): ");
        char color = lector.nextLine().charAt(0);
        
        switch (color){
            case 'V':
                System.out.println("Pots passar.");
                break;
            case 'T':
                System.out.println("Precaució.");
                break;
            case 'R':
                System.out.println("Has d'esperar.");
                break;
            default:
                System.out.println("LLetra no valida.");
        }
        
    }
    
}
