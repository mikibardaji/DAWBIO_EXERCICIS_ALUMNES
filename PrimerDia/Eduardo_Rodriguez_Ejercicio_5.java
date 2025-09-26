import java.util.Scanner;

public class Eduardo_Rodriguez_Ejercicio_5 {
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
            System.out.println("Tus numeros en orden");
            System.out.println(num1);
            System.out.println(num2);
        }
        else if (num2 > num1) {
            System.out.println("Tus numeros en orden");
            System.out.println(num2);
            System.out.println(num1);
        }
        else {
            System.out.println("Los numeros son iguales");
            System.out.println(num1);
            System.out.println(num2);
        }
    }
}
