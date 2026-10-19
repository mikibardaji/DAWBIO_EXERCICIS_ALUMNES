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
public class ex6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int negatius = 0;

        for (int i = 0; i < 10; i++) {
            int v = sc.nextInt();
            
            if (v == 0) {
                i--; 
            } else if (v < 0) {
                negatius++;
            }
        }

        if (negatius > 0) {
            System.out.println("S'ha detectat un valor crític!");
        } else {
            System.out.println("No s'ha detectat cap valor crític.");
        }

        System.out.println("S'han trobat " + negatius + " valors negatius.");
    }
}
