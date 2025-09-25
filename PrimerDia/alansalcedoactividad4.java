import java.util.Scanner;

public class positivo {
    public static void main(String[] args) {
        //pedir un numero y decir si es positivo o negativo
        //poner variable
        //pedir numero
        //comparar numero
        //mostrar resultado
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero = scanner.nextInt();
        if (numero >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
