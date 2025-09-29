import java.util.Scanner;

public class num_mayor {
    //Creo 3 variables para guardar 3 números
    //Pido los 3 números
    //Si cumple la condición de que el num1 es más grande que el num2 y num3 que lo muestre
    //En el caso de que el num2 sea más grande que el num1 y num3 que lo muestre
    //Si no cumple ninguna de estas condiciones, significa que el num3 es más grande que el num1 y num2 y hago que lo muestre
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner (System.in);
        double num1, num2, num3;
        System.out.println("Número 1: ");
        num1 = sc.nextDouble();
        System.out.println("Número 2: ");
        num2= sc.nextDouble();
        System.out.println("Número 3: ");
        num3 = sc.nextDouble();
        

        if (num1>num2 && num1>num3)
        {
            System.out.println("El número más grande es " + num1);
        }
        else if (num2>num1 && num2>num3)
        {
            System.out.println("El número más grande es " + num2);
        }
        else 
        {
            System.out.println("El número más grande es " + num3);
        }
    }
}
