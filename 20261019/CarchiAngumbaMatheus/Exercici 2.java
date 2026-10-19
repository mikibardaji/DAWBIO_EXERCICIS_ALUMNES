/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Quantes dosis necesites?");
        int dosis = lector.nextInt();
        System.out.println("EN WHILE");
        while (dosis>0) {
            dosis --;
            System.out.println("Dosis administrada, et falten " + dosis );             
        }
        System.out.println("Ja estás curat");  
        System.out.println("EN FOR");
        System.out.println("Quantes dosis necesites??");
        for (int dosis2 = lector.nextInt();dosis2 >0; dosis2 -- ){
            System.out.println("Dosis administrada, et falten " + (dosis2-1));
        }
        System.out.println("Ja t'has curat");
        }
        
        
        
        
        
        // TODO code application logic here
    }
    

