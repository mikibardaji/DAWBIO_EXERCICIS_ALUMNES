import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introdueix un número natural N: ");
        num = sc.nextInt();

        System.out.println("Números impar entre 1 i " + num + ":");

        int i = 3;

        while (i <= num) {
            System.out.println(i);
            i += 1;
        }

        sc.close();
    }
}

