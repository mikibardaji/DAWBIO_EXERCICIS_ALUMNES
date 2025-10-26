import java.util.Scanner;

public class Eduardo_Rodriguez_ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        menor(num1, num2);
        System.out.println("El menor es: " + menor(num1, num2));

    }

    private static int menor(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}