import java.util.Random;
import java.util.Scanner;

public class EJ14_Thiago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int min = 1;
        int max = 100;
        int intento;
        int intentos = 0;
        int mayor = 0;
        int menor = 0;
        char respuesta;

        System.out.println("Piensa un número del 1 al 100 y lo adivinare");
        System.out.println("Responde con '+' (más grande), '-' (más pequeño) o '=' (igual).");

        do {
            
            intento = rd.nextInt(max - min + 1) + min;
            intentos++;

            System.out.println("El ordenador piensa: " + intento);
            System.out.print("He acertado? ( + mayor, - menor, = igual ): ");
            respuesta = sc.nextLine().charAt(0);

            if (respuesta == '+') {
                min = intento + 1;
                mayor++;
            } else if (respuesta == '-') {
                max = intento - 1;
                menor++;
            } else if (respuesta == '=') {
                System.out.println("Acerte en " + intentos + " intentos");
                System.out.println("Pusiste más grande: " + mayor + " veces.");
                System.out.println("Pusiste más pequeño: " + menor + " veces.");
                break;
            } else {
                System.out.println("Error solo se permite '+', '-' o '='.");
            }

            if (min > max) {
                System.out.println("Las indicaciones estan mal");
                break;
            }

        } while (true);

        sc.close();
    }
}
