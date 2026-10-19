/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciteratives6;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class ExercIteratives6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i = 0;
    int critic = 0;
    int ritmo;
        
    while(i<10){
       Scanner scan  = new Scanner(System.in); 
        System.out.print("Introdueix el teu numero:");
        ritmo = scan.nextInt();
        i++;
        if (ritmo<0){
            critic++;
        }
    }
    if(critic>1){
        System.out.println("Hi ha "+ critic + "valors");
    } else {
        System.out.println("No hi ha cap valor critic");
    }
    }
    
}
