import java.util.Scanner;

public class Ex4_nombre_parell_contador1 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int contador, num_natural;

        System.out.println("Pon un número natural: ");
        num_natural = sc.nextInt();

        for (contador=1; num_natural>=contador; contador=contador+1)
        {
            if (contador%2==0)
            {
                System.out.println("Número parell: " + contador);
                contador=contador+1;
            }
        }
    }
}
