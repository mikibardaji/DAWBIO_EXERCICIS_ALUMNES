/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosisnecesarias;
import java.util.Scanner;

/**
 *
 * @author jncr5
 */
public class DosisNecesarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantas dosis necesitas? ");
        int dosisPendientes = scanner.nextInt();
        
        while (dosisPendientes > 0) {
            dosisPendientes--;

            System.out.println("Dosis administradas faltantes " + dosisPendientes + "…");
        }

        System.out.println("Ya estas curado");

        scanner.close();        
        // TODO code application logic here
    }
    
}
