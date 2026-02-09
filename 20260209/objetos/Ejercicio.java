package objetos;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcio;

        
        String[] noms = new String[10];

        do {
            mostrarMenu();
            opcio = obtenirOpcioUsuari(sc);

            switch (opcio) {
                case 'a':
                    llistarNoms(noms);
                    break;
                case 'b':
                    afegirNom(noms, sc);
                    break;
                case 'c':
                    modificarNom(noms, sc);
                    break;
                case 'd':
                    eliminarNom(noms, sc);
                    break;
                case 'e':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (opcio != 'e');

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Esborrar nom");
        System.out.println("e. Sortir");
    }

    private static char obtenirOpcioUsuari(Scanner sc) {
        System.out.print("Selecciona una opció: ");
        return sc.next().charAt(0);
    }


    private static void llistarNoms(String[] noms) {

        int contador = 0;

        for (int i = 0; i < noms.length; i++) {
            if (noms[i] != null && !noms[i].isEmpty()) {
                System.out.println(
                        noms[i].toUpperCase() + " (" + noms[i].length() + " letras)"
                );
                contador++;
            }
        }

        System.out.println("Total de nombres: " + contador);
    }


    private static void afegirNom(String[] noms, Scanner sc) {

        System.out.print("Introduce el nombre: ");
        sc.nextLine(); 
        String nouNom = sc.nextLine();

        for (int i = 0; i < noms.length; i++) {
            if (noms[i] == null || noms[i].isEmpty()) {
                noms[i] = nouNom;
                System.out.println("Nombre añadido correctamente.");
                return;
            }
        }

        System.out.println("No hay espacio disponible.");
    }

    private static void modificarNom(String[] noms, Scanner sc) {

        sc.nextLine(); 
        System.out.print("Nombre a modificar: ");
        String buscar = sc.nextLine();

        System.out.print("Nuevo nombre: ");
        String nouNom = sc.nextLine();

        for (int i = 0; i < noms.length; i++) {
            if (noms[i] != null && noms[i].equals(buscar)) {
                noms[i] = nouNom;
                System.out.println("Nombre modificado.");
                return;
            }
        }

        System.out.println("Nombre no encontrado.");
    }

    private static void eliminarNom(String[] noms, Scanner sc) {

        sc.nextLine(); 
        System.out.print("Nombre a eliminar: ");
        String eliminar = sc.nextLine();

        for (int i = 0; i < noms.length; i++) {
            if (noms[i] != null && noms[i].equals(eliminar)) {
                noms[i] = null;
                System.out.println("Nombre eliminado.");
                return;
            }
        }

        System.out.println("Nombre no encontrado.");
    }
}

