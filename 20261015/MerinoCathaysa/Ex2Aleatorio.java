/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroaleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cme4538
 */
public class Ex2Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rd = new Random();

        int monedaAleatoria = rd.nextInt(2);

        if (monedaAleatoria == 0) {
            System.out.println("Ha salido cara.");
        } else {
            System.out.println("Ha salido cruz.");
        }

    }

}
