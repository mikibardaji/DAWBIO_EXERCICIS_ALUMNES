import java.util.Scanner;

public class ex4 {
    static int obteSigne(int x) {
        if (x > 0)
            return 1;
        else if (x < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int n = in.nextInt();

        int signe = obteSigne(n);

        if (signe == 1)
            System.out.println("El numero es positivo.");
        else if (signe == -1)
            System.out.println("El numero es negativo.");
        else
            System.out.println("El numero es zero.");
    }
}
