/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratiuex14;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Iteratiuex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numero;
        String resposta;

        do {
            numero = (int) (Math.random() * 100) + 1;

            System.out.println("El teu número és " + numero + "?");
            System.out.print("És major, menor o igual? (major/menor/igual): ");
            resposta = sc.nextLine();

        } while (!resposta.equalsIgnoreCase("igual"));

        System.out.println("He endevinat el número!");
    }
    
}
