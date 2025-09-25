import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("");
        System.out.println("Dime el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Dime el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es el numero: " + num1);
        }
        else if (num2 > num1) {
            System.out.println("El numero mayor es el numero: " + num2);
        }
        else {
            System.out.println("Son iguales");
        }
    }
}
