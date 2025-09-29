import java.util.Scanner;

public class xavi_garcia_ex6_condicional {
    //dos valores
    //pregunta los dos valores
    //si primer valor mayor que el segundo mostrar que es mas grande que el primero 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("introduce num1");
        num1 = sc.nextInt();
        System.out.println("introduce num2");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("son iguales");
        }
    }
}
