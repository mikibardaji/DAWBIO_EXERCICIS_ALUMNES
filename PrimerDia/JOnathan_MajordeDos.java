import java.util.Scanner;

public class MajordeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introdueix el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = sc.nextInt();

        
        if (num1 > num2) {
            System.out.println("El número més gran és: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número més gran és: " + num2);
        } else {
            System.out.println("Els dos números són iguals.");
        }

        sc.close();
    }
}
