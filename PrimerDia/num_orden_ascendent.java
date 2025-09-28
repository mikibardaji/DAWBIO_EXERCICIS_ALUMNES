import java.util.Scanner;

public class num_orden_ascendent {
    //Creo 2 variables para guardar 2 números
    //Pido 2 números diferentes al usuario
    //Pongo la condición de que si el num1 es más grande que el num2, muestre los números en orden ascendente, es decir, 1ro el num2 y después el num1
    //En el caso de que no sea así y el num2 sea más grande que el num1 que muestres 1ro el num1 y luego el num2
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        double num1, num2;
        System.out.println("Número 1: ");
        num1 =sc.nextDouble();
        System.out.println("Número 2: ");
        num2 = sc.nextDouble();

        if (num1>num2)
        {
            System.out.println("El orden ascendente de estos números es el siguiente: " + num2 + " , " +num1 );
        }
        else if (num2>num1)
        {
            System.out.println("El orden ascendente de estos números es el siguiente: " + num1 + " , " + num2 );
        }
    }
}
