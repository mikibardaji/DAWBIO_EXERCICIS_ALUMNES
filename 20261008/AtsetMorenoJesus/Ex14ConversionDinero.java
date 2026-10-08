/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14conversiondinero;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ex14ConversionDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double euros,dolares,libras,yen;
        System.out.println("Introduzca una cantidad de dinero en euros: ");
        euros = lector.nextDouble();
        System.out.println("A que otra divisa lo quiere convertir?");
        System.out.println("A-Dolares.");
        System.out.println("B-Libras");
        System.out.println("C-Yen.");
        char divisa = lector.next().toUpperCase().charAt(0);
        dolares = euros*1.12;
        libras = euros*0.85;
        yen = euros*177;
        switch(divisa) {
            case 'A':
                System.out.println("El valor en dolares es: " + dolares + " dolares");
                break;
            case 'B':
                System.out.println("El valor en libras es: " + libras + " libras");
                break;
            case 'C':
                System.out.println("El valor en yen es: " + yen + " yenes");
            default:
                System.out.println("Entrada incorrecta");
        }
        
    }
    
}
