import java.util.Scanner;

public class Eduardo_Rodriguez_ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        producto(num1, num2);
        System.out.println("El resultado: " + producto(num1, num2));

    }

    private static double producto(double num1, double num2) {
        return num1 * num2;
    }
}