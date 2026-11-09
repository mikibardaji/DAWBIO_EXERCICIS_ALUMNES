/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package millas;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Millas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double x;
        
        try{
        System.out.println("Quantes milles a Kilometres vols?");
        x = lector.nextDouble();
        milles(x);
        }
        catch(InputMismatchException ex){
            System.out.println("No es un numero");
        }
    }
    
    public static double milles(double x){
        double milla=1.6093;
        double result = x * milla;
        System.out.println(result);
        return result;
    }
    
}
