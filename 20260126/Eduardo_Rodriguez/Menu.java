package objetos;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        char opcion;

        do {
            System.out.println("a) Mostrar valores");
            System.out.println("b) Introducir valor");
            System.out.println("c) Salir");
            opcion = sc.next().charAt(0);

            if (opcion == 'a') {
                mostrarValores(numeros);

            } else if (opcion == 'b') {
                introducirValor(numeros, sc);

            } else if (opcion == 'c') {
                System.out.println("Programa finalizado.");

            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 'c');

        sc.close();
    }

    // -------- MÉTODOS --------

    private static void mostrarValores(int[] array) {
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + array[i]);
        }
    }

    private static void introducirValor(int[] array, Scanner sc) {

        int posicion;

        // Validación de posición
        do {
            System.out.print("Introduce la posición (1 a 10): ");
            posicion = sc.nextInt();
        } while (posicion < 1 || posicion > array.length);

        int indice = posicion - 1;

        // Comprobar si ya hay valor
        if (array[indice] != 0) {
            System.out.print("Esa posición ya tiene un valor. ¿Deseas sobrescribirlo? (s/n): ");
            char respuesta = sc.next().toLowerCase().charAt(0);

            if (respuesta != 's') {
                System.out.println("Operación cancelada.");
                return;
            }
        }

        System.out.print("Introduce el valor: ");
        int valor = sc.nextInt();
        array[indice] = valor;

        System.out.println("Valor insertado correctamente.");
    }
}
