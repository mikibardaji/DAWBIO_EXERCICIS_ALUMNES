import java.util.Scanner;

public class Ex3_num_menor 
{
    public static void main(String[] args) 
    {
        int num_menor;
        num_menor=numMenor();
        System.out.println("El número menor es el " + num_menor);
    }
    private static int numMenor()
    {
        int num1, num2, num_menor=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        num1= sc.nextInt();
        System.out.println("Número 2: ");
        num2= sc.nextInt();
        if (num1>num2)
        {
            num_menor=num1;
        }
        else if (num2>num1)
        {
            num_menor=num2;
        }
        else 
        {
            System.out.println("Son iguales,vuelve a probar");
        }
        return num_menor;
    }
}
