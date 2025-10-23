import java.util.Scanner;

public class EJ1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2, mul;

        System.out.println("Pon el primer numero: ");
        num1 = sc.nextDouble();

        System.out.println("Ahora elige el segundo: ");
        num2 = sc.nextDouble();
        mul = producte(num1, num2);

        System.out.println("El resultado es " + mul);
        
        sc.close();
    }

    private static double producte(double x, double y)
    {
        return x * y;
    }
}
