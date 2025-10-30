import java.util.Scanner;

public class extensio_ex3 {

    public static int menor(int x, int y) {
        return (x < y) ? x : y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el primer número enter: ");
        int a = input.nextInt();

        System.out.print("Introdueix el segon número enter: ");
        int b = input.nextInt();

        System.out.println("El menor és: " + menor(a, b));
    }
}
