import java.util.Scanner;

public class Ejercicio_10_Eduardo_Rodriguez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            float temp = 0;
            int intentos = 0;

            while (temp < 36.5) {
                System.out.println("Introduce la temperatura: ");
                temp = sc.nextFloat();
                intentos++;
            }

            System.out.println("Haz calculado " + intentos + " Veces.");

    }
}
