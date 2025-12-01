import java.util.Scanner;
import Objectes.Persona;

public class PersonaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primera Persona");
        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Apellidos: ");
        String cognoms = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Edad: ");
        int edat = sc.nextInt();
        sc.nextLine();

        Persona persona1 = new Persona(nom, cognoms, dni, edat);

        System.out.println("Segunda persona");
        System.out.print("Nombre: ");
        nom = sc.nextLine();

        System.out.print("Apellidos: ");
        cognoms = sc.nextLine();

        System.out.print("DNI: ");
        dni = sc.nextLine();

        System.out.print("Edad: ");
        edat = sc.nextInt();
        sc.nextLine();

        Persona persona2 = new Persona(nom, cognoms, dni, edat);

        System.out.println("Persones:: ");
        persona1.mostrarPersona();
        persona1.esMajorEdat(); 


        persona2.mostrarPersona();
        persona2.esMajorEdat();

        System.out.println("Diferencia de edad: " + persona1.diferenciaEdat(persona2));
    }
}