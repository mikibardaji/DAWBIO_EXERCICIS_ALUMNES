/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexiteratives15;

import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExIteratives15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 15. Programa que mostra totes les taules de multiplicar entre 1 i 9.
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Anem a mostrar totes les taules del 1 al 9: ");
        System.out.print("Pulsa enter per continuar: ");
        lector.nextLine();
        System.out.println("");
        
        for(int i=1; i<=9;i++){
            System.out.println("Taula del " + i);
            System.out.println("-------------");
            System.out.println(i + " * 1 = " + (i*1));
            System.out.println(i + " * 2 = " + (i*2));
            System.out.println(i + " * 3 = " + (i*3));
            System.out.println(i + " * 4 = " + (i*4));
            System.out.println(i + " * 5 = " + (i*5));
            System.out.println(i + " * 6 = " + (i*6));
            System.out.println(i + " * 7 = " + (i*7));
            System.out.println(i + " * 8 = " + (i*8));
            System.out.println(i + " * 9 = " + (i*9));
            System.out.println(i + " * 10 = " + (i*10));
            System.out.println("");            
        }
    }
    
}
