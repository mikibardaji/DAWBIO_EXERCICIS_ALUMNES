/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
 import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class ex14 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 5; // Número fix
        int n;
        
        do {
            System.out.print("Endevina el número (1-10): ");
            n = sc.nextInt();
        } while (n != secret);
        
        System.out.println("Has encertat!");
    }
}

