import java.util.Scanner;

public class exxx7 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("introduce num_1");
        num1 = sc.nextInt();
        System.out.println("introduce num_2");
        num2 = sc.nextInt();
        System.out.println("introduce num_3");
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        } else {
            System.out.println("son iguales");
        }

    }
}
