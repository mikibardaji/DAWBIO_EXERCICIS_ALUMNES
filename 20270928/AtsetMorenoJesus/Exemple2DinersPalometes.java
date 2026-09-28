/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2dinerspalometes;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class Exemple2DinersPalometes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double dinersCartera = 100;
        System.out.println("Tens " + dinersCartera + " euros");
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantes entradas vols comprar?");
        int numEntrades = lector.nextInt();
        System.out.println("Quant val una entrada");
        double preuEntrada = lector.nextDouble();
        double preuTotal = preuEntrada*numEntrades;
        System.out.println("El preu total son " + preuTotal + " euros");
        double Totalcartera = dinersCartera - preuTotal;
        System.out.println("Et quedan " + Totalcartera + " euros a la cartera");
     
    }
    
}

