package arrays;

import java.util.Scanner;

public class ex12 {
/*
Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
que el usuario elija la opción ‘c’ que terminará el programa.
*/


public static void main(String[] args) throws Exception {
    int[] numeros = new int[10];
    Scanner sc = new Scanner(System.in);
    String opcion;
    do {
        System.out.println("Menu:");
        System.out.println("a. Mostrar valores.");
        System.out.println("b. Introducir valor.");
        System.out.println("c. Salir.");
        System.out.print("Elige una opcion: ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "a":
                System.out.println("Valores del array:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Posicion " + i + ": " + numeros[i]);
                }
                break;
            case "b":
                System.out.print("Introduce el valor (entero): ");
                int valor = sc.nextInt();
                System.out.print("Introduce la posicion (0-9): ");
                int posicion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                if (posicion >= 0 && posicion < numeros.length) {
                    numeros[posicion] = valor;
                    System.out.println("Valor introducido correctamente.");
                } else {
                    System.out.println("Posicion invalida. Debe estar entre 0 y 9.");
                }
                break;
            case "c":
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opcion invalida. Intenta de nuevo.");
        }

}
}
}