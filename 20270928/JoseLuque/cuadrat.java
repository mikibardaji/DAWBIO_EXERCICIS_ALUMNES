/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrat;
import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Cuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lector = new Scanner(System.in);
        System.out.println("Defineix el costat del teu cuadrat:");
        double costat = lector.nextDouble();
    double area = costat * costat;
        System.out.println("l'area del cuadrat es: "+area);
    }
    
}
