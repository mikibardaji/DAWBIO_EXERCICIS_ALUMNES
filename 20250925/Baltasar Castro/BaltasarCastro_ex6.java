import java.util.Scanner;

public class BaltasarCastro_ex6 {
public static void main(String[] args) {
    //Programa que llegeix dos números i ens diu quin és el més gran o si són iguals.
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

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else if (valor2 > valor1) {
            System.out.println(valor2);
        } else if (valor1 == valor2) 
        {
            
            System.out.println("Son iguales: " + valor1);
        }
}
}
