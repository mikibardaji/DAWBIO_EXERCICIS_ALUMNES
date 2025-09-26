import java.util.Scanner;

public class Eduardo_Rodriguez_Ejercicio_6 {
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
            System.out.println("El numero mayor es: " + num1 );
            System.out.println(num1 + " > " + num2);
        }
        else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num1 );
            System.out.println(num2 + " > " + num1);
        }
        else {
            System.out.println("Los dos numeros son iguales");
            System.out.println(num1 + " = " + num2);
        }
    }
}
