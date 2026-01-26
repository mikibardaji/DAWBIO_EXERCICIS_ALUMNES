package array;

import java.util.Scanner;

public class niveltao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numer[]= new int[10];
        String option;

        do {
            System.out.println("Menu:\n a. Mostrar valores.\n b. Introducir valor.\n c. Salir.");
            option = sc.nextLine().toLowerCase();

            switch(option){
                case "a":
                    for (int i = 0; i < numer.length; i++) {
                        System.out.println("Posicion " + i + ": " + numer[i]);
                    }
                    break;

                case "b":
                    System.out.println("Introduce el valor a insertar:");
                    int V = sc.nextInt();
                    System.out.println("Introduce la posicion (0-9):");
                    int P = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    if(P >= 0 && P < numer.length){
                        numer[P] = V;
                        System.out.println("Valor insertado.");
                    } else {
                        System.out.println("Posicion invalida.");
                    }
                    break;

                case "c":
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }

        } while(!option.equals("c"));
    }
}
