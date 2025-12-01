package objetos;

import java.util.Scanner;

public class personamain {
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

        persona persona1 = new persona(nom, cognoms, dni, edat);

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

        persona persona2 = new persona(nom, cognoms, dni, edat);

        System.out.println("Persones:: ");
        persona1.mostrarPersona();
        persona1.esMajorEdat(); 


        persona2.mostrarPersona();
        persona2.esMajorEdat();

        System.out.println("Diferencia de edad: " + persona1.diferenciaEdat(persona2));
    }
}