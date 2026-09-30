/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millesnautilusametres;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Millesnautilusametres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double millesNautilus, millesNautilusametres;
        System.out.println("Insertar Milles Nautiques");
        millesNautilus = lector.nextDouble();
        millesNautilusametres = millesNautilus * 1852;
        System.out.println(millesNautilus+" Milles Nautiques son " + millesNautilusametres +" metres");
    }
    
}
