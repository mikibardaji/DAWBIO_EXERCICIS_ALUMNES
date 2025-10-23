import java.util.Scanner;

public class EJ3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Pon el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Pon el segundo numero: ");
        num2 = sc.nextInt();

        resultado = menor(num1, num2);

        System.out.println("El menor es: " + resultado);

        sc.close();
    }

    private static int menor(int x, int y)
    {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
}
