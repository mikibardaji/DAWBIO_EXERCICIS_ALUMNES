import java.util.Scanner;

public class Ex3_nombre_parells 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int num_natural, contador;

        System.out.println("Pon un númerto natural: ");
        num_natural = sc.nextInt();

        for (contador=2; num_natural>=contador; contador++)
        {
            if (contador%2==0)
            {
                System.out.println("Númerp parell: " + contador);
            }
        }
    }

}
