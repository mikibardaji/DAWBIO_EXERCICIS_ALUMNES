import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        // Genera un número entre 1 i 6
        int dau = aleatorio.nextInt(6) + 1;

        System.out.println("Ha sortit: " + dau);

        if (dau == 6) {
            System.out.println("Has tret un 6!");
        } else if (dau == 1) {
            System.out.println("Quina mala sort!");
        } else {
            System.out.println("Resultat normal");
        }
    }
}
