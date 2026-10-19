/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1_globuls;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ex1_Globuls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int globuls;
        
        for (int i=1; i<=10; i++){
            System.out.print(i+".Quants globuls veus? ");
            globuls = scan.nextInt();
        }
        
        
        System.out.print("---------------");
        System.out.println("WHILE");
        
        int globuls2;
        int i = 1;
        System.out.print(i+".cuants globuls veus? ");
        globuls2 = scan.nextInt();
        
        while (i<=9){
            System.out.print(i+1+".Cuants globuls veus? ");
            globuls2 = scan.nextInt();
            i = i+1;
        }
        System.out.println("Ja has acabat");
    }
    
}
