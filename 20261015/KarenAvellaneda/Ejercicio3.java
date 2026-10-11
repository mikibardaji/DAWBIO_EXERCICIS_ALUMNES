
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // Genera un número entre 1 y 100.
        int numero = aleatorio.nextInt(100) + 1;

        System.out.println("Número generat: " + numero);

        if (numero % 2 == 0) {
            System.out.println("Parell");
        } else {
            System.out.println("Senar");
        }
    }
}
