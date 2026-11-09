/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions9;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int x = lector.nextInt();
        
     Scanner lector1 = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int y = lector1.nextInt();
     Scanner lector2 = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int z = lector2.nextInt();
        System.out.println(mesgran(x ,y ,z));   
       
    }
public static int mesgran(int x, int y , int z){
    int mesgran = x;
    if(mesgran<y){
        mesgran = y;
    } if(mesgran<z){
        mesgran = z;
    }
    
    return mesgran;
}
}
