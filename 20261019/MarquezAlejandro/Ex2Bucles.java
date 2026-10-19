/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2bucles;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Ex2Bucles {

    /**
     * @param args the command line arguments
     *     2. Dosi de medicament	
Un pacient ha de prendre n dosis d’un medicament, 
* fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora 
* (volta) quantes et queden
Fes un programa que mostri un missatge per cada hora:
        ◦ Quantes dosis necessites? 6
        ◦ Dosis administrada t’en falten 5…
        ◦ Dosis administrada t’en falten 4…
        ◦ ...
        ◦ Dosis administrada t’en falten 0…
                • Ja estas curat!!!
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int dosis, numusr;
        
        System.out.print("Quantes dosis necessites?: " );
        numusr = sc.nextInt();
        
        for(dosis = numusr - 1; dosis >= 0; dosis--){
            System.out.println("Dosis administrada t en falten " + dosis + "....");
        }
        System.out.println("Ja estas curat!!!");
    }
    
}
