import java.util.Scanner;

public class thiago_lafora_T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Introduce el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        num2 = sc.nextDouble();

        if (num1 < num2) {
            System.out.println("Orden ascendente:");
            System.out.println(num1);
            System.out.println(num2);

        } 
        else if (num2 < num1) {
            System.out.println("Orden ascendente:");
            System.out.println(num2);
            System.out.println(num1);   
        } 
        else {
            System.out.println("Ambos numeros son iguales.");
            System.out.println(num1 + " = " + num2);
        }
    }
}
