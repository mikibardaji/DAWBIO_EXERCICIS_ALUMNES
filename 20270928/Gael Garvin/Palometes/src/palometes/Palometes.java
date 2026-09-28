/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palometes;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Palometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quantitat d'entrades: ");
        
        
        Scanner lector = new Scanner(System.in);
        int NumPersonas = lector.nextInt();
        float PrecioEntrada = 7;
        
        double Preu = "PrecioEntrada * NumPersonas";
        
        System.out.println("PREU");
        
    }
    
}
