package objetos;

import java.util.Scanner;


public class PersonaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduiex dates de la primera persona:");
        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("Cognoms: ");
        String cognoms = sc.nextLine();

        System.out.print("Edat: ");
        int edat = sc.nextInt();
        sc.nextLine();

        Persona p1 = new Persona(dni, nom, cognoms, edat);

        System.out.println("Introduiex dates de la segona persona:");
        System.out.print("DNI: ");
        dni = sc.nextLine();

        System.out.print("Nom: ");
        nom = sc.nextLine();

        System.out.print("Cognoms: ");
        cognoms = sc.nextLine();

        System.out.print("Edat: ");
        edat = sc.nextInt();
        sc.nextLine();

        Persona p2 = new Persona(dni, nom, cognoms, edat);

        System.out.println("Resultats:");

        p1.mostrarPersona();

        if (p1.esMajorEdat()) {
            System.out.println(p1.getNom() + " és major d'edat");
        } else {
            System.out.println(p1.getNom() + " no és major d'edat");
        }

        if (p1.esJubilat()) {
            System.out.println(p1.getNom() + " està jubilat");
        } else {
            System.out.println(p1.getNom() + " no està jubilat");
        }

        System.out.println();

        p2.mostrarPersona();

        if (p2.esMajorEdat()) {
            System.out.println(p2.getNom() + " és major d'edat");
        } else {
            System.out.println(p2.getNom() + " no és major d'edat");
        }

        if (p2.esJubilat()) {
            System.out.println(p2.getNom() + " està jubilat");
        } else {
            System.out.println(p2.getNom() + " no està jubilat");
        }

        System.out.println();
        System.out.println("Diferència d'edat: " + p1.diferenciaEdat(p2));
    }
}
