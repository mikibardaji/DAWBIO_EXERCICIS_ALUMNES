import java.util.Scanner;

// Llegir tres números amb Scanner (a, b, c).
// Calcular el màxim.
// Comprovar si el màxim és únic o hi ha empat.
// Si és únic, imprimir quin nombre és el més gran; si hi ha empat, indicar-ho.

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double b = sc.nextDouble();

        System.out.print("Introdueix el tercer número: ");
        double c = sc.nextDouble();

        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int countMax = 0;
        if (a == max) countMax++;
        if (b == max) countMax++;
        if (c == max) countMax++;

        if (countMax == 1) {
            if (a == max) {
                System.out.println("El primer número (" + a + ") és el més gran.");
            } else if (b == max) {
                System.out.println("El segon número (" + b + ") és el més gran.");
            } else {
                System.out.println("El tercer número (" + c + ") és el més gran.");
            }
        } else {
            System.out.println("Hi ha un empat pel valor més alt: " + max);
        }

        sc.close();
    }
}