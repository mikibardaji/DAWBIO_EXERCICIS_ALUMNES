import java.util.Scanner;

public class EJ2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Pon tu edad: ");
        edad = sc.nextInt();

        if (Mayor(edad)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menos de edad");
        }

        sc.close();
    }

    private static boolean Mayor(int edat)
    {
        return edat >= 18;
    }
}
