import java.util.Scanner;

public class Eduardo_Rodriguez_EJER_libre_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura;
        String clima = null;

        System.out.println("Clasificador de temperaturas");
        System.out.println("Introduce la temperatura actual en grados Celsius: ");
        temperatura = sc.nextDouble();

        if (temperatura < 0) {
            clima = "Congelacion";
        } else if (temperatura >= 0 && temperatura < 10) {
            clima = "Muy frío";
        } else if (temperatura >= 10 && temperatura < 20) {
            clima = "Frío";
        } else if (temperatura >= 20 && temperatura < 30) {
            clima = "Agradable";
        } else if (temperatura >= 30 && temperatura < 40) {
            clima = "Caluroso";
        } else if (temperatura >= 40) {
            clima = "Infierno";
        }

        System.out.println("\nEl clima actual se clasifica como: " + clima);

    }
}