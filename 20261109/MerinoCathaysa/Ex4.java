/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author cme4538
 *
 * 4.	Programa que demana a l’usuari un nombre enter i mostra si és positiu,
 * zero o negatiu. Cal crear el mètode int obteSigne (int x), el qual retorna
 * -1, 0, +1 segons el nombre és negatiu, zero o positiu, respectivament.
 */
public class Ex4 {

    public static void main(String[] args) {
        
        int resultado, dato;
        
        dato = pedirDato();
        resultado = obteSigne(dato);
        mostrarResultado(resultado);

    }

    public static int pedirDato() {
        Scanner sc = new Scanner(System.in);
        int y;

        System.out.println("Dime un valor y te diré si es positivo, negativo o zero:");
        y = sc.nextInt();

        return y;
    }

    public static int obteSigne(int x) {

        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void mostrarResultado(int signo) {

        if (signo == 1) {
            System.out.println("Es positivo.");
        } else if (signo == -1) {
            System.out.println("Es negativo.");
        } else {
            System.out.println("Es zero.");
        }
    }
}
