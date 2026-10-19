/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercici2for;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici2For {

    public static void main(String[] args) {
        //Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden
        Scanner lector=new Scanner(System.in);
        System.out.print("Cuantas dosis necesitas?");
        int dosis= lector.nextInt();
        for(int i=(dosis-1);i>=0;i--){
            System.out.println("Dosis administrada t’en falten "+i+ "…");
            
        }
        System.out.println("•	Ja estas curat!!!");
    }
}
