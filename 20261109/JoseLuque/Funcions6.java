/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions6;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions6 {

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
        System.out.println(compara(x ,y));   
       
    }
public static int compara(int x, int y){
    int compara;
    if(x<y){
        compara = -1;
    } else if(x>y) {
        compara = 1;
    } else{
        compara = 0;
    } 
    if (compara== -1){
        System.out.println(x + " Es mes petit que " + y);
    } else if(compara == 0){
        System.out.println("son iguals");
    }else if (compara == 1){
        System.out.println(x + "Es mes gran que " + y);
    }
    return compara;
}

    
}


