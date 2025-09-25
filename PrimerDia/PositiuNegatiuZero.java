import java.util.Scanner;

public class PositiuNegatiuZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introdueix un número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("El número és positiu.");
        } else if (num < 0) {
            System.out.println("El número és negatiu.");
        } else {
            System.out.println("El número és zero.");
        }

        sc.close();
    }
}
