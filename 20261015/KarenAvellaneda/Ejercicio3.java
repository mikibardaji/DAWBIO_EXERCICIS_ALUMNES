import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(100) + 1;

        System.out.println("Número generado: " + numero);

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
