import java.util.Random;
import java.util.Scanner;

public class exceptions {

    /*Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. 
    Luego se le preguntará al usuario qué posición del vector quiere mostrar por pantalla, 
    repitiéndose una y otra vez hasta que se introduzca un valor negativo. Maneja todas las posibles excepciones. */

public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Tamaño aleatorio entre 1 y 100
        int N = random.nextInt(1,101);
        int[] vector = new int[N];

        // Rellenar el vector con valores entre 1 y 10
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1,11);
        }

        System.out.println("Vector creado con tamaño: " + N);
        int posicion=0;
        do {
            try {
                System.out.print("Introduce una posición del vector (negativo para salir): ");
                posicion = scanner.nextInt();

                // Mostrar el valor del vector
                System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: la posición está fuera del rango");

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: debes introducir un número entero.");
                scanner.next(); // Limpiar la entrada incorrecta

            } catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
            }
        }while (posicion>0);

        scanner.close();
    }
}



