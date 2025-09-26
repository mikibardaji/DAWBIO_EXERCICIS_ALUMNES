import java.util.Scanner;

public class BaltasarCastro_ex7 {
public static void main(String[] args) {
    //Programa que llegeix tres números diferents i ens diu quin és el més gran.
    //Preguntar el primer numero 
    //Preguntar el segundo numero
    //Si el primer numero es major q lo ponga 
    //Si el segundo es major q lo ponga
    //Si son iguales q lo ponga

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double valor1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double valor2 = sc.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double valor3 = sc.nextDouble();

        double mayor;

        if (valor1 > valor2 && valor1 > valor3) {
            mayor = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            mayor = valor2;
        } else {
            mayor = valor3;
        }

        System.out.println("El número más grande es: " + mayor);
}
}
