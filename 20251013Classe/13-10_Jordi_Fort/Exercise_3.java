/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.pkg10_exercise_bucles;

import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Exercise_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int entrada;
        
        System.out.print("Introduce un numero:");
        entrada = sc.nextInt();
        
        for (int i = 0; i < entrada; i+=2) {
            if(i != 0 && i % 2 == 0){
                System.out.println(i);        
            }
        }
           
    }
    
}
