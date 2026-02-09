import java.util.Scanner;

public class ejenombres {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nombres = new String[20];
        char opcio;

        do {
            mostrarMenu();
            opcio = obtenirOpcioUsuari();

            switch (opcio) {
                case 'a':
      //              llistarNoms(nombres);
                    break;

                case 'b':
           //         afegirNom(nombres);
                    break;

                case 'c':
                    modificarNom(nombres);
                    break;

                case 'd':
                    cercarNom(nombres);
                    break;

                case 'e':
                    esborrarNom(nombres);
                    break;

                case 'f':
                    System.out.println("Salir del programa...");
                    break;

                default:
                    System.out.println("Opció no vàlida. Vuelve a intentar.");
            }

        } while (opcio != 'f');
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Cerca en quina posició està un nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
    }

    private static char obtenirOpcioUsuari() {
        System.out.print("Selecciona una opció: ");
        char opcio =sc.next().charAt(0);
        return opcio;
    }

    private static void modificarNom(String[] nombres) {
        System.out.print("Introdueix el nom a modificar: ");
        String antic = sc.next();

        for (int i = 0; i < nombres.length; i++) {
            if (antic.equalsIgnoreCase(nombres[i])) {
                System.out.print("Introdueix el nou nom: ");
                nombres[i] = sc.next();
                System.out.println("Nom modificado correctamente.");
                return;
            }
        }

    }

    private static void cercarNom(String[] nombres) {
        System.out.print("Introducir el nombre a cercar: ");
        String nom = sc.next();

        for (int i = 0; i < nombres.length; i++) {
            if (nom.equalsIgnoreCase(nombres[i])) {
                System.out.println("El nom està a la posició " + i);
                return;
            }
        }
    }

    private static void esborrarNom(String[] nombres) {
        System.out.print("Introducir el nombre a cercar: ");
        String nom = sc.next();

        for (int i = 0; i < nombres.length; i++) {
            if (nom.equalsIgnoreCase(nombres[i])) {
                nombres[i] = null;
                System.out.println("Nombre eliminado.");
                return;
            }
        }
    }
}
