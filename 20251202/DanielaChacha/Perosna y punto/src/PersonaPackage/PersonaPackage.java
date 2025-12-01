package PersonaPackage;

import PersonaPackage.persona;
import java.util.Scanner;

public class PersonaPackage 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        String dni, nombre, apellidos;
        int edad;

        PersonaPackage persona1 = new PersonaPackage();
        System.out.println("Primera persona:");
        System.out.print("Introduce nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Introduce DNI: ");
        dni = sc.nextLine();

        System.out.print("Introduce edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        PersonaPackage persona2 = new PersonaPackage();
        System.out.println("Segunda persona:");
        System.out.print("Introduce nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce apellidos: ");
        apellidos = sc.nextLine();

        System.out.print("Introduce DNI: ");
        dni = sc.nextLine();

        System.out.print("Introduce edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        persona1.mostrarPersona();
        persona1.esMajor();
        persona2.mostrarPersona();
        persona2.esMajor();
    }
}