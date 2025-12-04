package PersonaPackage;

import PersonaPackage.persona;
import java.util.Scanner;

public class PersonaPackage 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Primera persona:");
        persona persona1 = new persona("01234567A", "Laia", "Martínez", 20);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellidos: " + persona1.getApellido());
        System.out.println("DNI: " + persona1.getDni());
        System.out.println("Edad: " + persona1.getEdad());

        persona1.setDni("NUEVO DNI");
        persona1.imprime();

        System.out.println("¿Mayor de edad? " + persona1.esMayor());
        System.out.println("¿Jubilado? " + persona1.esJubilado());

        System.out.println("Segunda persona:");
        persona persona2 = new persona("112233445Z", "Marc", "Ramírez", 10);
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellidos: " + persona2.getApellido());
        System.out.println("DNI: " + persona2.getDni());
        System.out.println("Edad: " + persona2.getEdad());
        
        persona1.setDni("NUEVO DNI");
        persona1.imprime();

        System.out.println("¿Mayor de edad? " + persona1.esMayor());
        System.out.println("¿Jubilado? " + persona1.esJubilado());
    }
}