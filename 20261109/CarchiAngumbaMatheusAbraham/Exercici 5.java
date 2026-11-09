/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime una distancia en millas (sin decimales): ");
        int valorMillas = lector.nextInt();
        double kilometres = millesAKm(valorMillas);
        System.out.println("Eso equivale a "+ kilometres + " km.");
        
    }
    
    public static double millesAKm(int milles){
        final double MILLA_A_KM = 1.6093 ;
        return milles*MILLA_A_KM;
    }

}
