/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularex4;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Modularex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Inserta un numero: ");
         int num = lector.nextInt();
         
         int res = obteSigne(num);
         
         if (res == 1){
             System.out.println("El numero es positiu");
         }else if(res == -1){
             System.out.println("El numero es negatiu");
         }else{
             System.out.println("EL numero es 0");
         }
    
    }
    public static int obteSigne(int x){
        if(x>0){
        return 1; 
        }else if(x<0){
        return -1;
        }else{
        return 0;
        }
            
    }
    
}
