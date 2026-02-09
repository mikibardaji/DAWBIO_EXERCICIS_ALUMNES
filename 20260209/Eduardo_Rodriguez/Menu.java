package objetos;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcio;

        Noms[] noms = new Noms[10];

        do {
            mostrarMenu();
            opcio = obtenirOpcioUsuari(sc);

            switch (opcio) {

                case '1':
                    afegirNom(noms, sc);
                    break;

                case '2':
                    llistarNoms(noms);
                    break;

                case '3':
                    modificarNom(noms, sc);
                    break;

                case '4':
                    eliminarNom(noms, sc);
                    break;

                case '5':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcio != '5');

        sc.close();
    }

    private static void mostrarMenu() {

        System.out.println("MENÚ ");
        System.out.println("1. Añadir nombre");
        System.out.println("2. Listar nombres");
        System.out.println("3. Modificar nombre");
        System.out.println("4. Eliminar nombre");
        System.out.println("5. Salir");
    }

    private static char obtenirOpcioUsuari(Scanner sc) {

        System.out.print("Selecciona una opción: ");

        String entrada = sc.nextLine().trim();

        if (entrada.isEmpty()) {
            return ' ';
        }

        return entrada.charAt(0);
    }

    private static void llistarNoms(Noms[] noms) {

        int contador = 0;

        System.out.println("\n--- LISTA DE NOMBRES ---");

        for (int i = 0; i < noms.length; i++) {

            if (noms[i] != null && !noms[i].estaBuit()) {

                System.out.println((i + 1) + ". " + noms[i]);
                contador++;
            }
        }

        System.out.println("Total: " + contador);
    }

    private static void afegirNom(Noms[] noms, Scanner sc) {

        System.out.print("Introduce el nombre: ");
        String nuevo = sc.nextLine().trim();

        if (nuevo.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        for (int i = 0; i < noms.length; i++) {

            if (noms[i] == null || noms[i].estaBuit()) {

                noms[i] = new Noms(nuevo);
                System.out.println("Nombre añadido.");
                return;
            }
        }

        System.out.println("No hay espacio disponible.");
    }

    private static void modificarNom(Noms[] noms, Scanner sc) {

        System.out.print("Nombre a modificar: ");
        String buscar = sc.nextLine().trim();

        System.out.print("Nuevo nombre: ");
        String nuevo = sc.nextLine().trim();

        if (nuevo.isEmpty()) {
            System.out.println("El nuevo nombre no puede estar vacío.");
            return;
        }

        for (int i = 0; i < noms.length; i++) {

            if (noms[i] != null && !noms[i].estaBuit()) {

                if (noms[i].getNom().equalsIgnoreCase(buscar)) {

                    noms[i].setNom(nuevo);
                    System.out.println("Nombre modificado.");
                    return;
                }
            }
        }

        System.out.println("Nombre no encontrado.");
    }

    private static void eliminarNom(Noms[] noms, Scanner sc) {

        System.out.print("Nombre a eliminar: ");
        String eliminar = sc.nextLine().trim();

        for (int i = 0; i < noms.length; i++) {

            if (noms[i] != null && !noms[i].estaBuit()) {

                if (noms[i].getNom().equalsIgnoreCase(eliminar)) {

                    noms[i].esborrar();
                    System.out.println("Nombre eliminado.");
                    return;
                }
            }
        }

        System.out.println("Nombre no encontrado.");
    }
}
