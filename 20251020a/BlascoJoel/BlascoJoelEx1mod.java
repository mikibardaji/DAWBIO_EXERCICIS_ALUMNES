import java.util.Scanner;

public class BlascoJoelEx1mod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Posa un numero: ");

        double numero1 = sc.nextDouble();

        System.out.print("Posa un altre: ");

        double numero2 = sc.nextDouble();

        double producte = producte(numero1, numero2);

        System.out.println("El producte de " + numero1 + " per " + numero2 + " es de " + producte);
    }

    private static double producte(double x, double y){

        double producte = x * y;
        return producte;
    }
}