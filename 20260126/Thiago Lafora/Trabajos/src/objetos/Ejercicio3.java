package objetos;

import java.util.Scanner;

public class Ejercicio3 {

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
                    introducirValorConConfirmacion(numeros, sc);
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
            System.out.println("Posicion " + (i + 1) + ": " + numeros[i]);
        }
    }

    public static void introducirValorConConfirmacion(int[] numeros, Scanner sc) {

        System.out.print("Introduce el valor: ");
        int valor = sc.nextInt();

        int posicion;
        do {
            System.out.print("Introduce la posición (1-" + numeros.length + "): ");
            posicion = sc.nextInt();
        } while (posicion < 1 || posicion > numeros.length);

        int indice = posicion - 1;

        if (numeros[indice] != 0) {
            System.out.print(
                "La posición ya tiene el valor " + numeros[indice] +
                ". ¿Quieres machacarlo? (s/n): "
            );

            char respuesta = sc.next().charAt(0);

            if (respuesta != 's' && respuesta != 'S') {
                System.out.println("Valor no modificado.");
                sc.nextLine(); 
                return;
            }
        }

        numeros[indice] = valor;
        System.out.println("Valor guardado correctamente.");
        sc.nextLine(); 
    }
}
