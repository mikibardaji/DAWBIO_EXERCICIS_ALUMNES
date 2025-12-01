import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);


        System.out.println(punto1 + "\n" + punto2 + "\n" + punto3);



        System.out.println("Introduzca los siguientes valores");
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("edad: ");
        int edad = sc.nextInt();

        Persona P = new Persona(DNI, nombre, apellidos, edad);

        System.out.println(P );
        sc.close();


        rectangulo rec = new rectangulo(0, 0, 5, 5);
        rectangulo rec2 = new rectangulo(7, 9, 2, 3);

        System.out.println(rec);
        System.out.println(rec2);

    }
}
