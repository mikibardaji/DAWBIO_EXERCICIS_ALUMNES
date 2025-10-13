import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introdueix un número natural N: ");
        num = sc.nextInt();

        System.out.println("Números parells entre 1 i " + num + ":");

        int i = 2;

        while (i <= num) {
            System.out.println(i);
            i += 2;
        }

        sc.close();
    }
}