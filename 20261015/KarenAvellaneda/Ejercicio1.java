import java.util.Scanner;
import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10) + 1;

        System.out.println("Introduce un número entre 1 y 10:");
        int respuesta = sc.nextInt();

        if (respuesta == numero) {
            System.out.println("¡Has acertado!");
        } else if (respuesta > numero) {
            System.out.println("¡Te has pasado!");
        } else {
            System.out.println("¡El número es más grande!");
        }

        sc.close();
    }
}
