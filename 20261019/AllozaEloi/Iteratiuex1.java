/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratiuex1;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Iteratiuex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int globul;
        for(int i=0;i<10;i++){
            System.out.println("Mostrant globul " +(i+1));
        }
        
        globul=0;
        while(globul<10){
            System.out.println("Mostrant globul "+(globul+1));
            globul++;
            
        }
    }
    
}
