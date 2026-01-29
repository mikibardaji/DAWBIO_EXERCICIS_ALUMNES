/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;
import java.util.Scanner;

/**
 *
 * @author claud
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numeros= new int[10];
        menu(numeros);
     
    
    }
     public static void menu(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        boolean salir=false;

        while (salir==false) {
            System.out.println("Introdueix la seva opcio: ");
            System.out.println("a. Mostrar valors");
            System.out.println("b. Introduir valor");
            System.out.println("c. Sortir");
            opcion = sc.nextLine();

            if (opcion.equals("a")) {
                mostrarArray(numeros);
            } 
            else if (opcion.equals("b")) {
                introducirValor(numeros);
            } 
            else if (opcion.equals("c")) {
                salir= true;
                System.out.println("Sortint del programa...");
            } 
            else {
                System.out.println("Opcio incorrecta");
            }
        }
    }

    public static void mostrarArray(int[] digitos) {
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("En la posicion " + i + " hi ha un: " + digitos[i]);
        }
    }

    public static void introducirValor(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        int valor;

        System.out.println("Introdueix una posicio del 0 al 9: ");
        posicion = sc.nextInt();

        if (posicion < 0 || posicion >= numeros.length) {
            System.out.println("Posicio no valida");
        } else {
            System.out.println("Introdueix el valor: ");
            valor = sc.nextInt();
            numeros[posicion] = valor;
        }

        sc.nextLine();
    }
}

    
    

