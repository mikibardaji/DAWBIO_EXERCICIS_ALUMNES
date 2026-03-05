import java.util.List;
import java.util.Scanner;

import Objetos.Amic;

public class Ejercicio 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Amic> agenda;
        int opcion = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1.- Agergar Amic");
            System.out.println("2.- Listar Amic");
            System.out.println("3.- Borrar Amic");
            System.out.println("4.- Salir");
            System.out.print("ELije una opcion: ");

            opcion = sc.nextInt();

            switch(opcion) 
            {

                case 1:
                    // CODI PER AFEGIR AMIC
                    break;

                case 2:
                    // CODI PER LLISTAR AMICS
                    break;

                case 3:
                    // CODI PER ESBORRAR AMIC
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while(opcion != 4);

        sc.close();
    }
    public static void agregarAmic()
    {
        System.out.println("Introduce el nombre de tu amigo: ");
        String nombre=sc.nextLine();
        System.out.println("Ahora introduce su edad: ");
        int edad

    }
}
