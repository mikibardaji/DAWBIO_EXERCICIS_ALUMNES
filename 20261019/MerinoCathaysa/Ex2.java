/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex2 {
    
    
    public static void main(String[] args) {
        
        /*Dosi de medicament
        Un pacient ha de prendre n dosis d’un medicament, 
        fes un simulacre que et pregunti quantes dosis necessites 
        i et mostri cada hora (volta) quantes et queden
        Fes un programa que mostri un missatge per cada hora:

        */
        
        Scanner sc = new Scanner(System.in);
        
        int dosis;
        System.out.println("¿Cuántas dósis ha de tomar el paciente?");
        dosis = sc.nextInt();
        
       // while (dosis >= 0){
            
        //    System.out.println("Dosis administrada, te faltan: " + dosis);
        //    dosis --;
       // } System.out.println("¡Ya estás curado!");
        
        for (int i = dosis; i >= 0; i--) {
            System.out.println("Dosis administrada, te faltan: " + i);
        }
    }
}
