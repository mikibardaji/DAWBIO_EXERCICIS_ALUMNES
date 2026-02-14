
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcio;
        String[] listaNombres = new String[10];
        listaNombres[0] = "Juan";
        listaNombres[1] = "Ana";
        listaNombres[2] = "Carlos";
        listaNombres[3] = " ";
        int numeroDeNombresTotal = 0;
        String nombreNuevoRemplazar = "";
        String nombreARemplazar = "";
        boolean encontreNombreACambiar = false;
        String nombreAencontrar = "";

        do {
            mostrarMenu();
            opcio = obtenerOpcioUsuario();

            switch (opcio) {
                case 'a':
                    for (int i = 0; i < listaNombres.length; i++) {
                        if (listaNombres[i] != null && listaNombres[i].trim().length() != 0) {

                            System.out.println(listaNombres[i].toUpperCase() + " tiene " + listaNombres[i].length() + " letras");
                            numeroDeNombresTotal = numeroDeNombresTotal + 1;
                        }
                    }
                    System.out.println("son un total de " + numeroDeNombresTotal + " nombres en la lista");
                    break;
                case 'b':
                    System.out.print("tienes estas posiciones para agregar nombres: ");
                    for (int i = 0; i < listaNombres.length; i++) {
                        if (listaNombres[i] == null || listaNombres[i].trim().length() == 0) {
                            System.out.print(i);
                            System.out.print(" | ");
                        }
                    }
                    System.out.println("");
                    int indiceNuevoNombre = 0;
                    do {
                        System.out.println("Coloca un indice valido");
                        indiceNuevoNombre = sc.nextInt();
                    } while (indiceNuevoNombre < 0 || indiceNuevoNombre >= listaNombres.length || (listaNombres[indiceNuevoNombre] != null && listaNombres[indiceNuevoNombre].trim().length() != 0));
                    sc.nextLine();
                    System.out.println("Que nombre quieres agregar?");
                    listaNombres[indiceNuevoNombre] = sc.nextLine();
                    System.out.println("Nombre Agregado!");

                    break;
                case 'c':
                    encontreNombreACambiar = false;
                    System.out.println("Dime que nombre quieres remplazar");
                    nombreARemplazar = sc.nextLine();
                    for (int i = 0; i < listaNombres.length; i++) {
                        if (nombreARemplazar.equalsIgnoreCase(listaNombres[i])) {
                            System.out.println("Dime por que nombre quieres remplazar a " + nombreARemplazar);
                            nombreNuevoRemplazar = sc.nextLine();
                            listaNombres[i] = nombreNuevoRemplazar;
                            System.out.println("Nombre cambiado con exito!");
                            encontreNombreACambiar = true;
                        }
                    }
                    if (encontreNombreACambiar == false) {
                        System.out.println("No Se ha podido encontrar el nombre a cambiar");
                    }

                    break;
                case 'd':
                    nombreAencontrar = "";
                    System.out.println("Que nombre quieres buscar?");
                    nombreAencontrar = sc.nextLine();
                    encontreNombreACambiar = false;
                    for (int i = 0; i < listaNombres.length; i++) {
                        if (nombreAencontrar.equalsIgnoreCase(listaNombres[i])) {
                            System.out.println("La posicion de " + listaNombres[i] + " es el indice " + i );
                            encontreNombreACambiar = true;
                        }
                    }
                    if (encontreNombreACambiar == false) {
                        System.out.println("No se pudo encontrar ese nombre");
                    }
                    break;
                case 'e':
                    nombreAencontrar = "";
                    System.out.println("Que nombre quieres buscar?");
                    nombreAencontrar = sc.nextLine();
                    encontreNombreACambiar = false;
                    for (int i = 0; i < listaNombres.length; i++) {
                        if (nombreAencontrar.equalsIgnoreCase(listaNombres[i])) {
                            listaNombres[i] = "";
                            System.out.println("Nombre borrado");
                            encontreNombreACambiar = true;
                        }
                    }
                    if (encontreNombreACambiar == false) {
                        System.out.println("No se pudo encontrar ese nombre para ser borrado");
                    }
                    break;
                case 'f':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Vuelve a intentar.");
            }

        } while (opcio != 'f');
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("a. Listar nombres");
        System.out.println("b. Añadir nombre");
        System.out.println("c. Modificar nombre");
        System.out.println("d. Buscar en qué posición nombre");
        System.out.println("e. Borrar nombre");
        System.out.println("f. Salir");
    }

    private static char obtenerOpcioUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Selecciona una opción: ");
        return sc.next().toLowerCase().charAt(0);

    }
}
