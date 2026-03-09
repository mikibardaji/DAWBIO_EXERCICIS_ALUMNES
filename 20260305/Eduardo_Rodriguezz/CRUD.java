import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ero0239
 */
public class CRUD {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Luchador> listaLuchadores = new ArrayList<>();

        int opcionMenu;

        do {

            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar luchador");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Eliminar luchador");
            System.out.println("4. Mostrar por categoria de peso");
            System.out.println("5. Insertar luchador en posicion");
            System.out.println("6. Modificar nombre de luchador");
            System.out.println("7. Salir");
            System.out.print("Escoge una opcion: ");

            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {

                case 1:
                    registrarLuchador(listaLuchadores);
                    break;

                case 2:
                    datosDemo(listaLuchadores);
                    mostrarLuchadores(listaLuchadores);
                    break;

                case 3:
                    eliminarLuchador(listaLuchadores);
                    break;

                case 4:
                    listarPorPeso(listaLuchadores);
                    break;

                case 5:
                    insertarEnPosicion(listaLuchadores);
                    break;

                case 6:
                    cambiarNombre(listaLuchadores);
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println();

        } while (opcionMenu != 7);
    }

    private static void registrarLuchador(List<Luchador> lista) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Introduce numero de licencia:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nombre del luchador:");
            String nombre = sc.nextLine();

            System.out.println("Peso del luchador:");
            int peso = sc.nextInt();
            sc.nextLine();

            Luchador luchador = new Luchador(id, nombre);
            luchador.setPeso(peso);

            if (lista.add(luchador)) {
                System.out.println("Luchador registrado correctamente");
            } else {
                System.out.println("No se pudo registrar");
            }

        } catch (NotValidWeightException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datosDemo(List<Luchador> lista) {

        try {

            Luchador l1 = new Luchador(2, "Topuria");
            l1.setPeso(100);
            lista.add(l1);

            Luchador l2 = new Luchador(3, "Joan");
            l2.setPeso(88);
            lista.add(l2);

            Luchador l3 = new Luchador(4, "Goku");
            l3.setPeso(94);
            lista.add(l3);

            Luchador l4 = new Luchador(5, "Vegetta");
            l4.setPeso(87);
            lista.add(l4);

        } catch (NotValidWeightException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarLuchadores(List<Luchador> lista) {

        int contador = 1;

        for (Luchador l : lista) {
            System.out.println(contador + ". " + l);
            contador++;
        }

        System.out.println("Total luchadores: " + lista.size());
    }

    private static void eliminarLuchador(List<Luchador> lista) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce licencia a eliminar:");
        int licencia = sc.nextInt();
        sc.nextLine();

        Luchador aux = new Luchador(licencia, "tmp");

        if (lista.remove(aux)) {
            System.out.println("Luchador eliminado");
        } else {
            System.out.println("No se encontro luchador con licencia " + licencia);
        }
    }

    private static void listarPorPeso(List<Luchador> lista) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce categoria:");
        String categoria = sc.nextLine().toUpperCase();

        int limite = 0;

        switch (categoria) {
            case "MOSCA":
                limite = 57;
                break;
            case "GALLO":
                limite = 62;
                break;
            case "PLUMA":
                limite = 65;
                break;
            case "SEMIPESADO":
                limite = 100;
                break;
            case "PESADO":
                limite = 200;
                break;
        }

        List<Luchador> filtrados = new ArrayList<>();

        for (Luchador l : lista) {
            if (l.getPeso() <= limite) {
                filtrados.add(l);
            }
        }

        int i = 1;

        for (Luchador l : filtrados) {
            System.out.println(i + ". " + l);
            i++;
        }

        System.out.println("Cantidad en categoria " + categoria + ": " + filtrados.size());
    }

    private static void cambiarNombre(List<Luchador> lista) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Licencia del luchador:");
        int licencia = sc.nextInt();
        sc.nextLine();

        System.out.println("Nuevo nombre:");
        String nuevoNombre = sc.nextLine();

        Luchador buscar = new Luchador(licencia, "aux");

        int pos = lista.indexOf(buscar);

        if (pos == -1) {
            System.out.println("No existe luchador con esa licencia");
        } else {
            lista.get(pos).setNombre(nuevoNombre);
            System.out.println("Nombre actualizado: " + lista.get(pos));
        }
    }

    private static void insertarEnPosicion(List<Luchador> lista) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Numero de licencia:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nombre:");
            String nombre = sc.nextLine();

            System.out.println("Peso:");
            int peso = sc.nextInt();
            sc.nextLine();

            System.out.println("Posicion (0 - " + lista.size() + "):");
            int pos = sc.nextInt();
            sc.nextLine();

            if (pos < 0 || pos > lista.size()) {
                System.out.println("Posicion incorrecta");
                return;
            }

            Luchador nuevo = new Luchador(id, nombre);
            nuevo.setPeso(peso);

            lista.add(pos, nuevo);

            System.out.println("Luchador insertado en posicion " + pos);

        } catch (NotValidWeightException e) {
            System.out.println(e.getMessage());
        }
    }
}