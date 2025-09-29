import java.util.Scanner;

public class Eduardo_Rodriguez_Ejercicio_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("");
        System.out.println("Dime el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Dime el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Dime el Tercer numero: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es el numero: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es el numero: " + num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero mayor es el numero: " + num3);
        }
        else {
            System.out.println("Todos los numeros son iguales: " + num1 + " = " + num2 + " = " + num3);
        }
    }
}
