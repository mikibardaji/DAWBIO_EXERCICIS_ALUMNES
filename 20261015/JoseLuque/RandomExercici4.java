import java.util.Random;

public class Dau {
    public static void main(String[] args) {
        Random aleatori = new Random();
        
        // Genera directamente un número entre 1 y 6
        int resultat = aleatori.nextInt(1, 7);
        
        System.out.println("El resultado es: " + resultat);
        
        if (resultat == 6) {
            System.out.println("¡Has sacado un 6!");
        } else if (resultat == 1) {
            System.out.println("¡Qué mala suerte!");
        } else {
            System.out.println("Resultado normal");
        }
    }
}
