/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package km.a.millas;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class KmAMillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuantas millas quieres pasar a quilometros: ");
        int millas = sc.nextInt();
        
        double kilometraje = millasakm(millas);
        
        System.out.println(millas+" millas son "+kilometraje+" kilometros");
        
    }
    public static double millasakm(int millas){
        return millas * 1.6093;
    }
    
}
