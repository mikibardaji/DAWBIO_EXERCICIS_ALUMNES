/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millastometers;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class Millastometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double millas,metros=0.0;
        final double MILLA_CNST=1852;
        System.out.println("Escriba el numero de millas nauticas a convertir a metros");
        Scanner lector=new Scanner(System.in);
        millas=lector.nextDouble();
        metros=millas*MILLA_CNST;
        System.out.println(millas+ "millas nauticas equivale a "+metros+"metros");
    }
    
}
