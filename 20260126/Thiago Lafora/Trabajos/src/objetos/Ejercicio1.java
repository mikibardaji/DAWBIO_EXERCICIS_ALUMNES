package objetos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        char opcion;

        do {
            System.out.println("Menu");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.println("Elige una opcion: ");

            opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    mostrarArray(numeros);
                    break;

                case 'b':
                    introducirValor(numeros, sc);
                    break;

                case 'c':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 'c');
    }

    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }

    public static void introducirValor(int[] numeros, Scanner sc) {
        System.out.println("Introduce el valor: ");
        int valor = sc.nextInt();

        System.out.println("Introduce la posicion (0-9): ");
        int posicion = sc.nextInt();
        sc.nextLine(); 

        if (posicion >= 0 && posicion < numeros.length) {
            numeros[posicion] = valor;
            System.out.println("Valor guardado correctamente.");
        } else {
            System.out.println("Posicion incorrecta.");
        }
    }
}
