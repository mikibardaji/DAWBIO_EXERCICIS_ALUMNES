import java.util.Scanner;

public class ej6modular {

    public static void main(String[] args) {
        // Programa que demana a l’usuari dos números enters i diu si són iguals o quin és més gran.
        int x = pregunta("Introdueix el primer número enter: ");
        int y = pregunta("Introdueix el segon número enter: ");

        compara(x, y);
    }

    public static int pregunta(String demanarnum) {
        Scanner sc = new Scanner(System.in);
        System.out.print(demanarnum);
        int valor = sc.nextInt();
        return valor;
    }

    public static int compara(int x, int y) {
        if (x < y) {
            System.out.println("El número més gran és: " + y);
            return -1;
        } else if (x == y) {
            System.out.println("Els dos números són iguals.");
            return 0;
        } else {
            System.out.println("El número més gran és: " + x);
            return 1;
        }
    }
}