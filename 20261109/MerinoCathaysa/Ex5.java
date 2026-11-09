/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 *
 * 5.	Programa que demana a l’usuari una distància mesurada en milles i mostra
 * el seu equivalent en quilòmetres (1 milla = 1,6093 km). Ha d’implementar un
 * mètode amb el prototip double millesAKm(int milles).
 *
 * @author cme4538
 */
public class Ex5 {

    public static void main(String[] args) {

        double resultado;
        int dato;
        dato = pedirDato();
        resultado = millesAKm(dato);
        mostrarResultado(resultado);

    }

    public static int pedirDato() {
        Scanner sc = new Scanner(System.in);
        int millas;

        System.out.println("Dime la distancia en millas y lo convertiré a km");
        millas = sc.nextInt();

        return millas;
    }

    public static double millesAKm(int milles) {
        return milles * 1.6093;
    }

    public static void mostrarResultado(double km) {

        System.out.println("La distancia en kilómetros es: " + km);
    }
}
