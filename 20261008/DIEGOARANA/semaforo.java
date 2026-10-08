/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semaforo;

import java.util.Scanner;

/**
 *
 * @author diego90895
 */
public class semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("De quin color està el semàfor? V-Verd / T-Taronja / R-Roig: ");
        
        // Llegim el caràcter i el passem a majúscules per evitar problemes
        char resposta = Character.toUpperCase(lector.next().charAt(0));
        
        switch (resposta) {
            case 'V':
                System.out.println("Passar");
                break;
            case 'T':
                System.out.println("Córrer (o frenar amb precaució)");
                break;
            case 'R':
                System.out.println("Esperar");
                break;
            default:
                System.out.println("Opció no vàlida. Si us plau, tria V, T o R.");
                break;
        }
        
        lector.close(); // Bona pràctica tancar el scanner
    }
}
