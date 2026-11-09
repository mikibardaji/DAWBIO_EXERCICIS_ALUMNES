/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5;

/**
 *
 * @author joel
 */

import java.util.Scanner;

public class Exercici5 {

    public static double millesAKm(int milles) {
        return milles * 1.6093;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix les milles: ");
        int milles = sc.nextInt();

        System.out.println("Els quilòmetres són: " + millesAKm(milles) + " km");
    }
}
