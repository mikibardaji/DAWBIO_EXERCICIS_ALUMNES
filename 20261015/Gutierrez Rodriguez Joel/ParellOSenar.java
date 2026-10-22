/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Fes un programa que generi aleatòriament un número entre 1 i 100.
 * @author jgu3417
 */


import java.util.Random;

public class ParellOSenar {
    public static void main(String[] args) {
        Random random = new Random();

        int numero = random.nextInt(100) + 1; // Número entre 1 i 100

        System.out.println("Numero generat: " + numero);

        if (numero % 2 == 0) {
            System.out.println("Parell");
        } else {
            System.out.println("Senar");
        }
    }
}
