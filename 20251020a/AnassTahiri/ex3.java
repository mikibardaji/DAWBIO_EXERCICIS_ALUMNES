import java.util.Scanner;

public class ex3 {
    static int menor(int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");

        int a = in.nextInt();

        System.out.print("Introduce el segundo numero: ");

        int b = in.nextInt();

        System.out.println("El menor es: " + menor(a, b));
    }
}
