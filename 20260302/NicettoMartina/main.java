import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<amic> listaAmigos = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Añadir Amigo");
            System.out.println("2. Listar Amigos");
            System.out.println("3. Borrar Amigo");
            System.out.println("4. Salir");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("Telefono: ");
                    String tel = sc.nextLine();

                    System.out.print("Edad: ");
                    int edat = sc.nextInt();
                   
                    System.out.println("");

                    amic nuevo = new amic(tel, nom, edat);
                    listaAmigos.add(nuevo);

                    System.out.println("Amigo añadido.");
                    break;

                case 2:

                    if (listaAmigos.isEmpty()) {
                        System.out.println("No hay amigos en la lista.");
                    } else {
                        for (amic a : listaAmigos) {
                            System.out.println(a);
                        }
                    }

                    break;

                case 3:

                   // no se
                    

                case 4:
                    System.out.println("Has salido");
                    break;

            }

        } while (opcion != 4);

    }

}