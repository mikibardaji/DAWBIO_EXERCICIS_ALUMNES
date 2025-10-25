import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        int x, y;
        PreguntaNum1();
        x = num1(0);
        PreguntaNum2();
        y = num2(0);

        int menor = menor(x, y);
        System.out.println("el nombre mes petit es: " + menor);
    }

    public static void PreguntaNum1() {
        System.out.println("Introdueix un numero per X:");
    }

    public static void PreguntaNum2() {
        System.out.println("Introdueix un altre numero per Y:");
    }

    public static int num1(int x) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    public static int num2(int y) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        return y;
    }

    public static int menor(int x, int y) {
        int menor;
        if (x < y) {
            System.out.print("x es menor que y,");
            menor = x;
        } else {
            System.out.print("y es menor que x,");
            menor = y;
        }
        return menor;
    }
}
