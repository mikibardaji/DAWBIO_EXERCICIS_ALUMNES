import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Introduce el primer número:");
        a = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        b = sc.nextDouble();

        if (a > b) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("Los números son iguales.");
        }
        sc.close();
    }
}
