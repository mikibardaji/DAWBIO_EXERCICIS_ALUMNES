/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2i3;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Ex2i3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Quant mesura el costat del teu quadrat?? : ");
        double costatQuadrat = teclat.nextDouble();
        double areaQuadrat = costatQuadrat * costatQuadrat;
        System.out.println("L'area del teu cuadrat es de " + areaQuadrat + " !!" );
        System.out.println("");
        System.out.print("Molt bé, ara dona'm un valor que t'agradi: ");
        double numFav = teclat.nextDouble();
        System.out.print("I un altre més: ");
        double numFav2 = teclat.nextDouble();
        double sumFav = numFav + numFav2;
        double restFav = numFav - numFav2;
        double prodFav = numFav * numFav2;
        double diviFav = numFav / numFav2;
        
        System.out.println("La suma dels teus números es: " + sumFav ) ;
        System.out.println("La resta dels teus números es: " + restFav ) ;
        System.out.println("El producte dels teus números es: " + prodFav ) ;
        System.out.println("El quocient dels teus números es: " + diviFav ) ;
               
               
        
        
        // TODO code application logic here
    }
    
}
