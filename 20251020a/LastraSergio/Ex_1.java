import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        double a, b;
        PreguntaNum1();
        a = num1(0);
        PreguntaNum2();
        b = num2(0);

        double suma = Suma(a, b);
        System.out.println("La suma dels nombres es: " + suma);
    }

    public static void PreguntaNum1() {
        System.out.println("Introdueix un numero enter:");
    }

    public static void PreguntaNum2() {
        System.out.println("Introdueix un altre numero enter:");
    }

    public static double num1(double a) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        return a;
    }

    public static double num2(double b) {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        return b;
    }

    public static double Suma(double a, double b) {
        return a + b;
    }
}
