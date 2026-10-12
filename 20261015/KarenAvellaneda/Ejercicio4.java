import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int dado = aleatorio.nextInt(6) + 1;

        System.out.println("Ha salido: " + dado);

        if (dado == 6) {
            System.out.println("¡Has sacado un 6!");
        } else if (dado == 1) {
            System.out.println("¡Qué mala suerte!");
        } else {
            System.out.println("Resultado normal");
        }
    }
}
