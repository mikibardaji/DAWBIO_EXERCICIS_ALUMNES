import java.util.Scanner;

public class Ex3 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        double numeros[] = new double[20];
        
        for (int i=0; i<numeros.length; i++)
        {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i]= sc.nextInt();
        }
        mostrarMax(numeros);
        mostrarMin(numeros);
    }

    private static void mostrarMax(double numeros [])
    {
        double max= numeros[0];

        for (int i = 1; i < numeros.length; i++)
        {
            if (numeros[i] > max)
            {
                max = numeros[i];
            }
        }
        System.out.println("El número máximo es: " + max);
    }

    private static void mostrarMin(double numeros[])
    {
        double min = numeros[0];

        for (int i = 1; i < numeros.length; i++)
        {
            if (numeros[i] < min)
            {
                min = numeros[i];
            }
        }
        System.out.println("El número mínimo es: " + min);
    }
}