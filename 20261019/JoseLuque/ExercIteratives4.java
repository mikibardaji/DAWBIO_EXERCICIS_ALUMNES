/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciteratives4;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class ExercIteratives4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // TODO code application logic here
     Scanner scan  = new Scanner(System.in);
    int numero;
        System.out.print("Introdueix el teu numero:");
        numero = scan.nextInt();
     int contador = 1;
     while(contador<numero){
         if((contador % 2)== 0 ){
             System.out.println(contador);
             contador++;
         
         } else {
             contador++;
         }
     }
    }
    
}
