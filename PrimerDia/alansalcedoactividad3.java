import java.util.Scanner;

public class numeromayoromenor {
    public static void main(String[] args) {
        //saber cual es el numero mayor y cual es el menor
        //poner variables
        //pedir numeros
        //comparar numeros
        //mostrar resultados
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Introduce el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
            System.out.println("El numero menor es: " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El numero mayor es: " + numero2);
            System.out.println("El numero menor es: " + numero1);
        } else {
            System.out.println("Los numeros son iguales");
        }     
    }
}
