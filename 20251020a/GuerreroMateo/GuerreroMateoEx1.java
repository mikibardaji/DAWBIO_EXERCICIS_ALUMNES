import java.util.Scanner;

public class GuerreroMateoEx1 {
    public static void main(String[] args) {
        pedirNum();
        double producte;
        producte = producte(0, 0);
        System.out.println(producte);
    }

    public static void pedirNum() {
        System.out.println("Ingresa dos numeros");
    }

    private static double producte(double numero1, double numero2) {
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextDouble();
        numero2 = sc.nextDouble();
        sc.close();
        double producte;
        producte = numero1 + numero2;
        return producte;
    }
}