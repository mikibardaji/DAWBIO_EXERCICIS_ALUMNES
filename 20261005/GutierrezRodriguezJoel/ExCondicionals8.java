/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excondicionals8;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class ExCondicionals8 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Demanar la primera nota
        System.out.print("Entra la primera nota: ");
        double nota1 = lector.nextDouble();
        
        // Demanar la segona nota
        System.out.print("Entra la segona nota: ");
        double nota2 = lector.nextDouble();
        
        // Comprovar si alguna nota és més petita que 5
        if (nota1 < 5 || nota2 < 5) {
            System.out.println("Has d’anar a segona convocatoria");
        } else {
            System.out.println("Felicitats, modul superat");
        }
    }
}
