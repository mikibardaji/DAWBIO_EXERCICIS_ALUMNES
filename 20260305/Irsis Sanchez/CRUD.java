import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Objetos.Luchador;
import Objetos.NotValidWeightException;

public class CRUD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        List<Luchador> mundial = new ArrayList<>();

        añadirDatosEjemplo(mundial);

        do {
            mostrarMenu();
	    boolean valorEntero = false;
            
            try {
                opcion = sc.nextInt();
                sc.nextLine(); 
                
                switch (opcion) {
                    case 1:
                        altaUsuario(mundial, sc);
                        break;
                    case 2:
                        listarLuchadores(mundial);
                        break;
                    case 3:
                        borrarLuchador(mundial, sc);
                        break;
                    case 4:
                        listarLuchadoresPeso(mundial, sc);
                        break;
                    case 5:
                        añadirLuchadorPosicion(mundial, sc);
                        break;
                    case 6:
                        cambiarNombre(mundial, sc);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Error: Introduce un número.");
                sc.nextLine(); 
            }
            
        } while (opcion != 7);

    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Registrar Luchador");
        System.out.println("2. Listar todos");
        System.out.println("3. Borrar Luchador");
        System.out.println("4. Listar por categoría");
        System.out.println("5. Añadir en posición");
        System.out.println("6. Cambiar nombre");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }

    private static void altaUsuario(List<Luchador> mundial, Scanner sc) {
        try {
            System.out.print("Licencia: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Peso: ");
            int peso = sc.nextInt();
            sc.nextLine();

            Luchador nuevo = new Luchador(id, nombre);
            nuevo.setPeso(peso);

            if (mundial.add(nuevo)) {
                System.out.println("Luchador añadido.");
            }
        } catch (NotValidWeightException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error en los datos.");
            sc.nextLine();
        }
    }

    private static void listarLuchadores(List<Luchador> mundial) {
        if (mundial.isEmpty()) {
            System.out.println("Lista vacía.");
        } else {
            for (int i = 0; i < mundial.size(); i++) {
                System.out.println((i + 1) + ". " + mundial.get(i).toString());
            }
        }
    }

    private static void borrarLuchador(List<Luchador> mundial, Scanner sc) {
        System.out.print("Licencia a borrar: ");
        int idLicencia = sc.nextInt();
        sc.nextLine();

        Luchador temp = new Luchador(idLicencia, "");
        
        if (mundial.remove(temp)) {
            System.out.println("Borrado correctamente.");
        } else {
            System.out.println("No se ha encontrado.");
        }
    }

    private static void listarLuchadoresPeso(List<Luchador> mundial, Scanner sc) {
        System.out.print("Categoría (MOSCA, GALLO, PLUMA, PESADO): ");
        String cat = sc.nextLine().toUpperCase();
        int limite = 0;

        switch (cat) {
            case "MOSCA": limite = 57; break;
            case "GALLO": limite = 62; break;
            case "PLUMA": limite = 65; break;
            case "PESADO": limite = 200; break;
            default: limite = 100;
        }

        for (Luchador l : mundial) {
            if (l.getPeso() <= limite) {
                System.out.println("- " + l.getNombre() + " (" + l.getPeso() + "kg)");
            }
        }
    }

    private static void añadirLuchadorPosicion(List<Luchador> mundial, Scanner sc) {
        try {
            System.out.print("Posición: ");
            int pos = sc.nextInt();
            sc.nextLine();

            if (pos >= 0 && pos <= mundial.size()) {
                System.out.print("Licencia: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Nombre: ");
                String nom = sc.nextLine();
                System.out.print("Peso: ");
                int peso = sc.nextInt(); sc.nextLine();

                Luchador l = new Luchador(id, nom);
                l.setPeso(peso);
                mundial.add(pos, l);
                System.out.println("Luchador insertado.");
            } else {
                System.out.println("Posición incorrecta.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar.");
            sc.nextLine();
        }
    }

    private static void cambiarNombre(List<Luchador> mundial, Scanner sc) {
        System.out.print("Licencia: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        int pos = mundial.indexOf(new Luchador(id, ""));
        
        if (pos != -1) {
            System.out.print("Nuevo nombre: ");
            String nuevo = sc.nextLine();
            mundial.get(pos).setNombre(nuevo);
            System.out.println("Actualizado.");
        } else {
            System.out.println("No encontrado.");
        }
    }

    private static void añadirDatosEjemplo(List<Luchador> mundial) {
        try {
            Luchador l1 = new Luchador(1, "Topuria");
            l1.setPeso(65);
            mundial.add(l1);
            Luchador l2 = new Luchador(2, "Goku");
            l2.setPeso(75);
            mundial.add(l2);
        } catch (NotValidWeightException e) {}
    }
}