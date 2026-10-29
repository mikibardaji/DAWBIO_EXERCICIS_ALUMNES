/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String notaString;
        int nota;
        do {
            System.out.print("Introdueix la nota del examen: ");
            notaString = lector.nextLine();
            nota = Integer.parseInt(notaString);
            if (nota >10 || nota<0) {
                System.out.println("");
                System.out.println("Valor incorrecte. La nota ha d'estar entre 0 i 10.");
            }
        } while (nota >10 || nota<0);
        System.out.println("");
        System.out.println("Nota registrada correctament: "+ nota);                            
    }
    
}
