import java.util.Scanner;

public class xavier_garcia_ex5_condicional {
    //dos valores
    //pregunta los dos valores
    //si primer valor mayor que el segundo mostrar el mas grande primero luego el mas pequeño
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("introduce num1");
        num1 = sc.nextInt();
        System.out.println("introduce num2");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + num1);
        }

    }
}
