/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cercle;
import java.util.Scanner;

/**
 *
 * @author mca3765
 */
public class Cercle {
 
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radiCercle, circumCercle, areaCercle;
        final double PI = 3.14159265359;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el radi del cercle en cm: ");
        radiCercle = teclat.nextDouble();
        
        circumCercle = 2 * PI * radiCercle;
        areaCercle = PI * radiCercle * radiCercle;        
        System.out.println("La circumferència del teu cercle es " + circumCercle + " cm i la seva àrea de " + areaCercle + " cm^2" );
        
        // TODO code application logic here
    }
    
}
