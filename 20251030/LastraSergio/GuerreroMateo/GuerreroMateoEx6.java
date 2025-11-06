import java.util.Scanner;

public class GuerreroMateoEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        int x = sc.nextInt();

        System.out.print("Introdueix el segon número: ");
        int y = sc.nextInt();

        int resultat = compara(x, y);

        if (resultat == 0) {
            System.out.println("Els dos nombres són iguals.");
        } else if (resultat == -1) {
            System.out.println("El més gran és: " + y);
        } else {
            System.out.println("El més gran és: " + x);
        }

        sc.close();
    }

    public static int compara(int x, int y) {
        if (x < y) {
            return -1;
        } else if (x == y) {
            return 0;
        } else {
            return 1;
        }
    }
}

