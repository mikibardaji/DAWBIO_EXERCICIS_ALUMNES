/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tensionarterial;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class Tensionarterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         int contador = 1;
        boolean valorCritico = false;

        while (contador <= 10) {
            System.out.print("Introdueix la tensió arterial " + contador + ": ");
            int tensio = lector.nextInt();

            if (tensio <= 0) {
                valorCritico = true;
            }

            contador++;
        }

        if (valorCritico) {
            System.out.println("S'ha detectat algun valor crític: error de mesura o pacient fictici.");
        } else {
            System.out.println("No s'ha detectat cap valor crític.");
        }
         
                
        // TODO code application logic here
    }
    
}
