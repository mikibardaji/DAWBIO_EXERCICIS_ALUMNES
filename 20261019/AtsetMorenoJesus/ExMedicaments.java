/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmedicaments;

import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class ExMedicaments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dosis;
        
        System.out.print("Cuanta dosis necesites prendre d'un medicament? ");
        dosis = lector.nextInt();
        
        while(dosis>0){
            System.out.println("Dosis adminitrada, et queden " +(dosis-1));
            dosis = dosis - 1;
        }
        System.out.println("Estas curat!!");
        // TODO code application logic here
    }
    
    
}
