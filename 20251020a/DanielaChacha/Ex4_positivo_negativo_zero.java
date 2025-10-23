import java.util.Scanner;

public class Ex4_positivo_negativo_zero 
{
    public static void main(String[] args) 
    {
        int num;
        num=tipo();
        System.out.println(num);

    }
    private static int tipo()
    {
        int num, tipo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: "); 
        num= sc.nextInt();
        if (num>0)
        {
            tipo=+1;
        }
        else if (num<0)
        {
            tipo=-1;
        }
        else 
        {
            tipo=0;
        }
        return tipo;
    }
}