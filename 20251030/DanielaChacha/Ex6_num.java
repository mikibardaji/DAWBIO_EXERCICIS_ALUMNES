import java.util.Scanner;

public class Ex6_num 
{
    public static void main(String[] args) 
    {
        int num1=pedirNumero(1);
        int num2=pedirNumero(2);

        int comparar=calculoNum(num1, num2);
        mostrarResultado(comparar, num1, num2);

    }
    public static int pedirNumero(int x)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el num " + x + " :");
        int num=sc.nextInt();
        return num;
    }
    public static int calculoNum (int x, int y)
    {
        int valor=0;
        if (x>y)
        {
            valor=1;
        }
        else if (y>x)
        {
            valor=-1;
        }
        return valor;
    }
    public static void mostrarResultado(int valor, int num1, int num2)
    {
        if (valor==1)
        {
            System.out.println("El número más grnde es "+ num1);
        }
        else if (valor==-1)
        {
            System.out.println("El número mas grande es "+ num2);
        }
        else
        {
            System.out.println("Los números son iguales");
        }
    }
}