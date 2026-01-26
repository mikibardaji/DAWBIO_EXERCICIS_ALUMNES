import java.util.Random;

public class Ex4b 
{
    public static void main(String[] args) 
    {
        int numeros[] = new int[20];
        Random rd = new Random();

        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = rd.nextInt(-10, 11);
        }

        mostrarNum(numeros);
        mostrarSumaPos(numeros);
        mostrarSumaNeg(numeros);
    }

    private static void mostrarNum(int numeros[])
    {
        for (int i = 0; i<numeros.length; i++)
        {
            System.out.println("Número " + i + ": " + numeros[i]);
        }
    }

    private static void mostrarSumaPos(int numeros[])
    {
        int sumaPos = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] >0)
            {
                sumaPos += numeros[i];
            }
        }
        System.out.println("Suma de números positivos: " + sumaPos);
    }

    private static void mostrarSumaNeg(int numeros[])
    {
        int sumaNeg = 0;

        for (int i = 0; i<numeros.length; i++)
        {
            if (numeros[i]<0)
            {
                sumaNeg += numeros[i];
            }
        }
        System.out.println("Suma de números negativos: " + sumaNeg);
    }
}