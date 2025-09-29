import java.util.Scanner;

// Llegir dos números amb Scanner.
// Comparar-los: si a > b → primer és més gran.
// Si b > a → segon és més gran.
// Si no (a == b) → indicar que són iguals.
// Mostrar el missatge corresponent per pantalla.

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("El primer número (" + a + ") és més gran que el segon (" + b + ").");
        } else if (b > a) {
            System.out.println("El segon número (" + b + ") és més gran que el primer (" + a + ").");
        } else {
            System.out.println("Els números són iguals (" + a + ").");
        }

        sc.close();
    }
}