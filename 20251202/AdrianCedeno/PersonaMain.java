
import java.util.Scanner;

import Objetos.Persona;

public class PersonaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nom, cognoms, dni;
        int edat;

        System.out.println("Primera Persona");
        System.out.print("Nom: ");
        nom = sc.nextLine();

        System.out.print("Cognoms: ");
        cognoms = sc.nextLine();

        System.out.print("DNI: ");
        dni = sc.nextLine();

        System.out.print("Edat: ");
        edat = sc.nextInt();
        sc.nextLine();

        Persona persona1 = new Persona(nom, cognoms, dni, edat);

        System.out.println("Segona persona");
        System.out.print("Nom: ");
        nom = sc.nextLine();

        System.out.print("Cognoms: ");
        cognoms = sc.nextLine();

        System.out.print("DNI: ");
        dni = sc.nextLine();

        System.out.print("Edat: ");
        edat = sc.nextInt();
        sc.nextLine();

        Persona persona2 = new Persona(nom, cognoms, dni, edat);

        System.out.println("Persones introduïdes:");
        persona1.mostrarPersona();
        persona1.esMajorEdat();
        persona1.esJubilat();

        persona2.mostrarPersona();
        persona2.esMajorEdat();
        persona2.esJubilat();

        System.out.println("Diferencia de edat: " + persona1.diferenciaEdat(persona2));

        sc.close();
    }
}
