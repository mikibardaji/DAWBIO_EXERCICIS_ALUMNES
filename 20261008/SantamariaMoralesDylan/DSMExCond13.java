/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexcond13;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExCond13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 13.	Desenvolupem un ajudant infantil per decidir què fer davant un semàfor. 
        // El programa demanarà de quin color està el semàfor (V-verd/T-Taronja/Roig-Aturar) i segons la resposta recomanarà passar, 
        // esperar, o córrer.
        
        Scanner lector = new Scanner(System.in);              
                
        System.out.print("Hola, en quin color esta el semafor? Posa nomes una de les llestres següents (V-Verd / T-Taronja / R-Roig): ");
        char color = lector.nextLine().charAt(0);
        
        switch (color){
            case 'V':
                System.out.println("Pots passar.");
                break;
            case 'T':
                System.out.println("Córre.");
                break;
            case 'R':
                System.out.println("Tens que esperar.");
                break;
            default:
                System.out.println("LLetra no valida.");
        }
        
    }
    
}
