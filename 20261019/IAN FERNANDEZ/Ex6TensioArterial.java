/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6.tensio.arterial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ex6TensioArterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int contador = 0;
        
        for (int i=1; i<=10; i++){
            System.out.print(i+".Escriu la teva tensio: ");
            int tensio = s.nextInt();
            if(tensio<0){
                
                contador ++;
            }
            else if (tensio==0){
                System.out.println("No pot ser 0");
                 tensio = s.nextInt();
            }
        }
        System.out.println("Han hagut "+ contador +" valors critics ");
    }
    
}
