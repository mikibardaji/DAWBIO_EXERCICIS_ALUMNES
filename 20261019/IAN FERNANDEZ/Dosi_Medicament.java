/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosi_medicament;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Dosi_Medicament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int dosis;
        System.out.print("Quantes dosis necessites? ");
        dosis = scan.nextInt();
        
        for(int i=dosis; i>0; i--){
            
            System.out.println("Dosis administrada. Et falten "+ i +"");
            
        }
        System.out.println("Ultima dosis administrada. Estas curat!! ");
       
        
        
        
        
        
        
        System.out.println("---------------");
        System.out.println("DO WHILE");
        
        int dosis2;
        System.out.println("Quantes dosis necessites? ");
        dosis2 = scan.nextInt();
        
        do{
            System.out.println("dosis administrada et queden " + dosis2 + "");
            dosis2 = dosis2 -1;
        }while(dosis2>0);
        System.out.println("Ultima dosis administrada. Estas curat!");
    }
    
}
