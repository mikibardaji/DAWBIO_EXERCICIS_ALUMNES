package crud;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ace1509
 */
public class CRUD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Luchador> mundial = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Alta Luchador");
            System.out.println("2. Listar todos objetos");
            System.out.println("3. Bprrar Objetos");
            System.out.println("4. Lista Luchadores por categoria de peso");
            System.out.println("5. Añadir Luchador en posicion elegida");
            System.out.println("6. Cambiar nombre de luchador (Pedir id licencia)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opcion 1");
                    altaUsuario(mundial);
                    break;
                case 2:
                    System.out.println("Has elegido la Opcion 2");
                    AñadirDatosEjemplo(mundial);
                    LlistarLuchadores(mundial);
                    break;
                case 3:
                    System.out.println("Has elegido la Opcion 3");
                    BorrarLuchador(mundial);
                    break;
                case 4:
                    System.out.println("Has elegido la Opcion 4");
                    CriterioListar(mundial);
                    break;
                case 5:
                    System.out.println("Has elegido la Opcion 5");
                    AñadirEnPosicion(mundial);
                    break;
                case 6:
                    System.out.println("Has elegido la Opcion 6");
                    CambiarNameLuchador(mundial);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Esta opcion no esta disponible en el menu!");
            }

            System.out.println();

        } while (opcion != 7);
    }

    private static void altaUsuario(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Pon el numero de licencia");
            int id = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            System.out.println("Pon el nombre del luchador");
            String nombre = sc.nextLine();

            System.out.println("Pon el peso del luchador");
            int peso = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            Luchador wrestler = new Luchador(id, nombre);
            wrestler.setPeso(peso);

            if (mundial.add(wrestler)) {
                System.out.println("Luchador añadido");
            } else {
                System.out.println("Luchador no se ha podido añadir");
            }

        } catch (NotValidWeightException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Vuelve a intentar dar de alta");
        }
    }

    private static void AñadirDatosEjemplo(List<Luchador> mundial) {
        try {
            System.out.println("Añadiendo 4 luchadores de prueba....");

            Luchador ejemplo = new Luchador(2, "Topuria");
            ejemplo.setPeso(100);
            mundial.add(ejemplo);

            ejemplo = new Luchador(3, "Joan");
            ejemplo.setPeso(88);
            mundial.add(ejemplo);

            ejemplo = new Luchador(4, "Goku");
            ejemplo.setPeso(94);
            mundial.add(ejemplo);

            ejemplo = new Luchador(5, "Vegetta");
            ejemplo.setPeso(87);
            mundial.add(ejemplo);

        } catch (NotValidWeightException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Vuelve a intentar dar de alta");
        }
    }

    private static void LlistarLuchadores(List<Luchador> mundial) {
        int num = 1;
        for (Luchador fighter : mundial) {
            System.out.println(num + " " + fighter);
            num++;
        }
        System.out.println("Luchadores en el mundial: " + mundial.size());
    }

    private static void BorrarLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon la licencia que quieres dar de baja: ");
        int IdLicencia = sc.nextInt();
        sc.nextLine();

        Luchador fakeDel = new Luchador(IdLicencia, "Fake Nombre");

        if (mundial.remove(fakeDel)) {
            System.out.println("Luchador eliminado");
        } else {
            System.out.println("No he podido borrar luchador con licencia "
                    + fakeDel.getIdLicencia());
        }
    }

    private static void CriterioListar(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que categoria quieres ver?");
        String categoria = sc.nextLine().toUpperCase();
        int PesoLimite = 0;
        switch (categoria) {
            case "MOSCA":
                PesoLimite = 57;
                break;
            case "GALLO":
                PesoLimite = 62;
                break;
            case "PLUMA":
                PesoLimite = 65;
                break;
            case "SEMIPESADO":
                PesoLimite = 100;
                break;
            case "PESADO":
                PesoLimite = 200;
                break;
        }

        List<Luchador> luchadorSeleccionadoPorPeso = new ArrayList<>();
        for (Luchador l : mundial) {
            if (l.getPeso() <= PesoLimite) {
                luchadorSeleccionadoPorPeso.add(l);
            }
        }

        int num = 1;
        for (Luchador fighter : luchadorSeleccionadoPorPeso) {
            System.out.println(num + " " + fighter);
            num++;
        }
        System.out.println("Luchadores por peso " + categoria + " : " + luchadorSeleccionadoPorPeso);
    }

    private static void CambiarNameLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Licencia de Jugador: ");
        int Licencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Que nombre quieres poner");
        String Nombre = sc.nextLine();

        Luchador NameChange = new Luchador(Licencia, "Juan");
        int posicion = mundial.indexOf(NameChange);

        if (posicion == -1) {
            System.out.println("Luchador no existe con licencia");
        } else {
            mundial.get(posicion).setNombre(Nombre);
            System.out.println("Nombre cambiado! " + mundial.get(posicion));
        }
    }

    // === NUEVA FUNCION ===
    private static void AñadirEnPosicion(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Pon el numero de licencia");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Pon el nombre del luchador");
            String nombre = sc.nextLine();

            System.out.println("Pon el peso del luchador");
            int peso = sc.nextInt();
            sc.nextLine();

            System.out.println("En que posicion quieres añadirlo? (0 a " + mundial.size() + ")");
            int posicion = sc.nextInt();
            sc.nextLine();

            if (posicion < 0 || posicion > mundial.size()) {
                System.out.println("Posicion invalida!");
                return;
            }

            Luchador wrestler = new Luchador(id, nombre);
            wrestler.setPeso(peso);

            mundial.add(posicion, wrestler);
            System.out.println("Luchador añadido en la posicion " + posicion);

        } catch (NotValidWeightException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Vuelve a intentar dar de alta");
        }
    }
}
