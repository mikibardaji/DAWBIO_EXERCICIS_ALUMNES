import java.util.Scanner;
public class extensio_ex1 {

    public static double producte(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el primer número real: ");
        double a = input.nextDouble();

        System.out.print("Introdueix el segon número real: ");
        double b = input.nextDouble();

        System.out.println("El producte és: " + producte(a, b));
    }
}


