/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalex13;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Condicionalex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
         System.out.print("De quin color està el semàfor? (V/T/R): ");
        char color = lector.next().toUpperCase().charAt(0);

        switch (color) {
            case 'V':
                System.out.println("Passar");
                break;

            case 'T':
                System.out.println("Esperar");
                break;

            case 'R':
                System.out.println("Aturar");
                break;

            default:
                System.out.println("Color no vàlid");
        }
    }
    
}
