import java.util.Scanner;

public class extensio_ex4 {

    public static int obteSigne(int x) {
        if (x < 0) return -1;
        else if (x == 0) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix un número enter: ");
        int n = input.nextInt();

        int signe = obteSigne(n);

        if (signe == -1)
            System.out.println("El número és negatiu.");
        else if (signe == 0)
            System.out.println("El número és zero.");
        else
            System.out.println("El número és positiu.");
    }
}
