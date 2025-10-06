import java.util.Scanner;

public class Eduardo_Rodriguez_EJER_libre_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        int experiencia;
        String trabajo = null;

        System.out.println("Bienvenido a la entrevista de trabajo,completa los siguientes datos: ");

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        System.out.println("Años de experiencia");
        experiencia = sc.nextInt();

        if (edad < 18 && edad > 16) {
            trabajo = "Practicante de enfermeria";
        } else if (edad >= 18 && experiencia < 1) {
            trabajo = "Auxiliar de enfermería";
        } else if (edad >= 18 && experiencia >= 1 && experiencia <= 5) {
            trabajo = "Enfermero general";
        } else if (edad >= 25 && experiencia > 5 && experiencia <= 15) {
            trabajo = "Enfermero especialista";
        } else if (edad > 40 && experiencia > 15) {
            trabajo = "Director de enfermería";
        } else {
            trabajo = "No tienes la edad suficiente";
        }

        System.out.println("Eres apto para trabajar de: " + trabajo);
    }
}