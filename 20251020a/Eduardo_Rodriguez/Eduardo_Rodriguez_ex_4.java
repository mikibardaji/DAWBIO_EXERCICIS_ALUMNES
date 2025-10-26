import java.util.Scanner;

public class Eduardo_Rodriguez_ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        obt(num);

        if (obt(num) == 1) {
            System.out.println("El numero es positivo");
        } else if (obt(num) == 2) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

    }

    private static int obt(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return 2;
        } else {
            return 0;
        }
    }
}