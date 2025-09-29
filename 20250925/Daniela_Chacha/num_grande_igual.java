import java.util.Scanner;

public class num_grande_igual {
    //Creo 2 variables para almacenar 2 números
    //Pido los 2 números al usuario
    //Si cumple la condición de que el num1 es más grande que el num2, que lo muestre
    //En el caso de que el num1 sea igual al num2, que muestre que son iguales
    //Si no cumple ninguna de las dos anteriores, es decir, que el num2 es más grande que el num1, que lo muestre
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        double num1, num2;
        System.out.println("Número 1: ");
        num1 = sc.nextDouble();
        System.out.println("Número 2: ");
        num2 = sc.nextDouble();

        if (num1>num2)
        {
            System.out.println("El número " + num1 + " es más grande que el número " + num2 );
        }
        else if (num1==num2)
        {
            System.out.println("El número " + num1 + " y el número " + num2 + " son iguales");
        }
        else
        {
            System.out.println("El número " + num2 + " es más grande que el número " + num1 );
        }     
    }
}
