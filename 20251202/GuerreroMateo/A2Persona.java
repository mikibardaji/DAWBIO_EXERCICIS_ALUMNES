import Objetos.Persona;
import java.util.Scanner;

public class A2Persona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        System.out.println("Datos de la primera persona:");
        System.out.print("DNI: ");
        p1.dni = sc.nextLine();
        System.out.print("Nombre: ");
        p1.nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        p1.apellidos = sc.nextLine();
        System.out.print("Edad: ");
        p1.edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Datos de la segunda persona:");
        System.out.print("DNI: ");
        p2.dni = sc.nextLine();
        System.out.print("Nombre: ");
        p2.nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        p2.apellidos = sc.nextLine();
        System.out.print("Edad: ");
        p2.edad = sc.nextInt();

        mostrarMensaje(p1);
        mostrarMensaje(p2);

        sc.close();
    }

    public static void mostrarMensaje(Persona p) {
        String mayor = p.edad >= 18 ? "es mayor de edad" : "no es mayor de edad";
        System.out.println(p.nombre + " " + p.apellidos + " con DNI " + p.dni + " " + mayor);
    }
}
