/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Example22;

import java.util.Scanner;

/**
 *
 * @author diego90895
 */
public class Example22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double QuantitatEntrades, PreuEntrada, PreuEntrades, QuantitatDiners, TotalEntrades;
        Scanner lector = new Scanner(System.in);
        System.out.println("Quants diners tens?");
            QuantitatDiners = lector.nextDouble();
        System.out.println("Quantes entrades vols comprar?");
            QuantitatEntrades = lector.nextDouble();
        System.out.println("Quant val una entrada?");
            PreuEntrada = lector.nextDouble();
            PreuEntrades = (QuantitatEntrades * PreuEntrada);
            TotalEntrades = (QuantitatDiners - PreuEntrades);
        System.out.println("Et queden " 
           + TotalEntrades + "€"
        );
    }
    
}
