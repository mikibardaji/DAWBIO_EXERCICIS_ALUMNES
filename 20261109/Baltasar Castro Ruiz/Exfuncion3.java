/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class Exfuncion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix el primer número enter: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introdueix el segon número enter: ");
        int num2 = scanner.nextInt();
        
        int resultat = menor(num1, num2);
        
        System.out.println("El menor dels dos números és: " + resultat);
        
        scanner.close();
    }

    public static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
}
