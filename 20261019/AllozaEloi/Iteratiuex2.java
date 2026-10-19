/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratiuex2;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Iteratiuex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int dosis, dosis2;
        System.out.print("Quantes dosis necessites? ");
        dosis = lector.nextInt();
        
        do{
            System.out.println("Dosis administrada t’en falten "+dosis);
            dosis=dosis-1;
        } while(dosis>0);
        System.out.println("Ja estas curat");
        
        System.out.print("2-Quantes dosis necessites? ");
        dosis2=lector.nextInt();
        while (dosis2>0){
            System.out.println("Dosis administrada t’en falten "+dosis2);
            dosis2=dosis2-1;
            
        }
        System.out.println("Ja estas curat");
            
        
    }
    
}
