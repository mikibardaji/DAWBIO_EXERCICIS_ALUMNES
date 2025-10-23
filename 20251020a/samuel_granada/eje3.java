import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        int menor, x, y;
        x = llamarx(0);
        y = llamary(0);
        menor = menor(x, y);
        System.out.println("el numero menor es: " + menor);
    }

    public static int llamarx(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el primer numero ");
        x = sc.nextInt();
        sc.close();
        return x;
    }

    public static int llamary(int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el primer numero ");
        y = sc.nextInt();
        sc.close();
        return y;
    }

    public static int menor(int x, int y) {
        int menol;

        if (x >= y) {
            menol = y;
        } else {
            menol = x;
        }

        return menol;
    }
}
