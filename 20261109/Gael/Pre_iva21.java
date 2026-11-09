/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pre_iva21;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Pre_iva21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num = 0;
        num = persona(num);
        iva(num);
    }
    
    public static double persona(double num){
        System.out.println("Diguem el preu: ");
        Scanner lector = new Scanner(System.in);
        num = lector.nextDouble();
        return num;
    }
    
    public static double iva(double num){
        double ambIva = num + (num * 0.21);
        System.out.println(ambIva);
        return ambIva;
    }
}
