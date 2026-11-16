/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcio2;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mca3765
 */
public class Funcio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double producte = preguntarNum("Introdueix el preu sencer del producte: ");
        double producteDescompte = preguntarNum("Introdueix el preu del producte amb descompte: ");
        System.out.printf("El descompte es del %.2f%%" , percentDescompte(producte,producteDescompte));
        
    }
    
    public static double percentDescompte(double product,double productDesc) {
            // System.out.println(tauler);
            return 100-((productDesc/product)*100) ;
            
        }
        
       
    
    public static double preguntarNum(String frase) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        double resposta = 0;
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.nextDouble();
                if (resposta >= 0) {
                    valido = true;
                } else {
                    System.out.println("Valor no valid, ha de ser positiu");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valid, has de posar un número");
                System.out.println("");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
    }
    
}
