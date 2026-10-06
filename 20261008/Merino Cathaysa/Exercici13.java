/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String color;
        
        System.out.println("¿De qué color está el semáforo, verde, naranja o rojo?");
        color = sc.next().toLowerCase();
        
        if (color.equalsIgnoreCase("verde")) {
            System.out.println("Puedes pasar");
        } else if (color.equalsIgnoreCase("naranja")) {
            System.out.println("¡CORRE!");
        } else if (color.equalsIgnoreCase("rojo")) {
            System.out.println("Para");
        } else {
            System.out.println("Color incorrecto, introduce verde, naranja o rojo.");
        }
    }
    
}
