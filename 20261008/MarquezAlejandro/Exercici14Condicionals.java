/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14condicionals;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Exercici14Condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double euros;
        int opcion;

        System.out.println("Introduce el importe en euros (€):");
        euros = sc.nextDouble();

        System.out.println("¿A qué moneda quieres hacer la conversión?");
        System.out.println("1. Dólares (USD)");
        System.out.println("2. Yenes japoneses (JPY)");
        System.out.println("3. Rublos rusos (RUB)");
        System.out.println("Introduce el número de la opción (1, 2 o 3):");
        
        opcion = sc.nextInt();

        // Usamos switch para evaluar la variable 'opcio'
        switch (opcion) {
            case 1:
                System.out.println(euros + "€ son " + (euros * 1.119) + " USD.");
                break;
            case 2:
                System.out.println(euros + "€ son " + (euros * 177.188) + " JPY.");
                break;
            case 3:
                System.out.println(euros + "€ son " + (euros * 95.149) + " RUB.");
                break;
            default:
                System.out.println("Opción incorrecta. Debes elegir 1, 2 o 3.");
                break;
        }
        
    }
    
}
