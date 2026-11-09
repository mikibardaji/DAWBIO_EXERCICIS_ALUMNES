/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions3;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int y = lector.nextInt();
        
        Scanner lector1 = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int x = lector1.nextInt();
       
        
        System.out.println("El numero mes petit es: " + menor(x,y));
    }
public static int menor(int x,int y )
        {
       int menor;
        if (x<y){
            menor = x;
        } else{
            menor = y;
        }
        return menor;
    }

}
