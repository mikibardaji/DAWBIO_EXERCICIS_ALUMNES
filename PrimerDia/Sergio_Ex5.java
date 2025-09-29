import java.util.Scanner;

// Leer dos números desde l'entrada amb Scanner.
// Comparar els dos nombres amb una condició (a <= b).
// Si a <= b, mostrar "a b"; si no, mostrar "b a".
// Mostrar el resultat per pantalla.


public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Introdueix el segon número: ");
        double b = sc.nextDouble();

        System.out.print("Nombres en ordre ascendent: ");
        if (a <= b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }

        sc.close();
    }
}
