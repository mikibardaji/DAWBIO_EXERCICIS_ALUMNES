/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions8;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int m = lector.nextInt();
        
     Scanner lector1 = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int n = lector1.nextInt();
        System.out.println("Els dos numeros sumats son: "+sumatori(n,m) + " i multiplicats: " + productori(n,m) );
    }
    public static int sumatori(int n, int m){
        int suma = n + m;
       
        return suma;   
    }
    public static int productori(int n, int m){
         int productori = m*n;
         return productori;
    }
}
