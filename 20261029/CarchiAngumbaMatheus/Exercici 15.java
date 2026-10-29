/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();
        int num = 5;
        System.out.println("La tabla del " +num + " es:");
        for (int contador=1; contador<=10;contador++){
            System.out.println(num+ " X "+contador +" = "+ num*contador  );
        }
    }
}
