/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;
import java.util.Scanner;
/**
 *
 * @author jncr5
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el primer numero: ");
        int x = sc.nextInt();
        
        System.out.println("Dime el segundo numero: ");
        int y = sc.nextInt();
        
        int chiqui = menor(x,y);
        
        System.out.println("El numero mas pequeño es el "+chiqui);
        sc.close();
    } public static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
 }
}
