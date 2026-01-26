import java.util.Random;

public class Ex4a 
{
    public static void main(String[] args) 
    {
        int numeros []= new int [21];
        Random rd= new Random();

        for (int i=0; i<numeros.length; i++)
        {
            numeros [i]= rd.nextInt (-10,11);
        }
        mostrarNum(numeros);
        mostrarPos(numeros);
        mostrarNeg(numeros);
    }   

    private static void mostrarNum(int numeros[])
    {
        for (int i = 0; i<numeros.length; i++)
        {
            System.out.println("Número " + i + ": " + numeros[i]);
        }
    }

    private static void mostrarPos(int numeros[])
    {
        int contadorPos=0;
        
        for(int i=0; i<numeros.length; i++)
        {
            if (numeros[i] > 0)
            {
                contadorPos++;
            }
        }
        System.out.println("Total de números positivos: " + contadorPos);
    }

    private static void mostrarNeg(int numeros[])
    {
        int contadorNeg = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] < 0)
            {
                contadorNeg++;
            }
        }
        System.out.println("Total de números positivos: " + contadorNeg);
    }
}