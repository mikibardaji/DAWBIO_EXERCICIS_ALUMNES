/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalex14;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Condicionalex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner lector = new Scanner(System.in);

        System.out.print("Introdueix un import en euros: ");
        double euros = lector.nextDouble();

        System.out.println("\n--- MENU DE MONEDES ---");
        System.out.println("1. Dòlars (USD)");
        System.out.println("2. Iens (JPY)");
        System.out.println("3. Yuans (CNY)");
        System.out.println("4. Rublos (RUB)");

        System.out.print("Escull una moneda: ");
        int opcio = lector.nextInt();

        double resultat;

        switch (opcio) {
            case 1:
                resultat = euros * 1.17;
                System.out.println(euros + " € són " + resultat + " USD");
                break;

            case 2:
                resultat = euros * 182.0;
                System.out.println(euros + " € són " + resultat + " JPY");
                break;

            case 3:
                resultat = euros * 8.3;
                System.out.println(euros + " € són " + resultat + " CNY");
                break;

            case 4:
                resultat = euros * 95.0;
                System.out.println(euros + " € són " + resultat + " RUB");
                break;

            default:
                System.out.println("Opció no vàlida");
        }

    }
    
}
