import java.util.Scanner;

public class BaltasarCastro_ex5 {
public static void main(String[] args) {
//Programa que llegeix dos números i els visualitza en ordre ascendent.
//Preguntar el primer numero 
//Preguntar el segundo numero
//Si el primer numero es major q vbaya primero 
//Si el segundo es major q vaya primero 
//Si son iguales q lo ponga
 
Scanner sc = new Scanner(System.in);

        double valor1; 
        double valor2;

        System.out.print("Introduce el primer número: ");
        valor1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        valor2 = sc.nextDouble();

        if (valor1 < valor2) {
            System.out.println("Orden ascendente: " + valor1 + "," + valor2);
        } else if (valor1 > valor2) {
            System.out.println("Orden ascendente: " + valor2 + "," + valor1);
        } else {
            System.out.println("Los dos números son iguales: " + valor1);
        }
}
}
