// Ejercicio 10: Control de temperatura corporal
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int intentos = 0;
        double temperatura;
        
        do {
            intentos++;
            temperatura = 35 + (45 - 35) * rand.nextDouble();
            temperatura = Math.round(temperatura * 10.0) / 10.0; // redondear a 1 decimal
            System.out.println("Introdueix temperatura: " + temperatura);
        } while (temperatura < 36.5);
        
        System.out.println("Han calgut " + intentos + " mesures.");
    }
}
