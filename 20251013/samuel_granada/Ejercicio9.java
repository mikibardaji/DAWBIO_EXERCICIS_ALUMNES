// Ejercicio 9: Calcular media de pulsaciones
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            int pulsaciones = rand.nextInt(121) + 30; // entre 30 y 150
            System.out.println("Introduceix pulsacions minut " + i + ": " + pulsaciones);
            total += pulsaciones;
        }
        double media = total / 5.0;
        System.out.printf("Mitjana = %.1f bpm%n", media);
    }
}
