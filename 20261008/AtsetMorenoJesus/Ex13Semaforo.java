/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13semaforo;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ex13Semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime de que color esta el semáforo:");
        System.out.println("V-Verde.");
        System.out.println("A-Amarillo.");
        System.out.println("R-Rojo.");
        char color = lector.next().toUpperCase().charAt(0);
        switch(color) {
            case 'V':
                System.out.println("Puedes pasar");
                break;
            case 'A':
                System.out.println("Correeeeeeee");
                break;
            case 'R':
                System.out.println("Espera");
            default:
                System.out.println("Color incorrecto");
        }
        
    }
    
}
