/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author bca5802
 */
public class ex10 {
    public static void main(String[] args) {
            int hores;
        int minuts;
        int segons;
        int temps;

        
        Scanner sc = new Scanner (System.in);
            
        System.out.println("Hores");
         hores = sc.nextInt();
         
        System.out.println("Minuts");
         minuts = sc.nextInt();
         
        System.out.println("segons");
         segons = sc.nextInt();
         
         
        System.out.println("temps");
         temps = sc.nextInt();

        segons = segons + temps;

        if (segons >= 60) {
            minuts = minuts + segons / 60;
            segons = segons % 60;
        }

        if (minuts >= 60) {
            hores = hores + minuts / 60;
            minuts = minuts % 60;
        }

        // Si pasa de las 24 horas
        if (hores >= 24) {
            hores = hores % 24;
        }

        System.out.println("Hora final: " + hores + ":" + minuts + ":" + segons);
    }
}
