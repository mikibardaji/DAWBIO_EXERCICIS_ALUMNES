import java.util.Scanner;

public class Ex2_menor_major_edad 
{
    public static void main(String[] args) 
    {
        boolean edad;
        edad=edad();
    }
    private static boolean edad()
    {
        int edad;
        boolean majorEdad=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();

        if (edad>=18)
        {  
            majorEdad=true;
            System.out.println("Eres mayor de edad");
        }
        else
        {
            majorEdad= false;
            System.out.println("No eres mayor de edad");
        }
        return majorEdad;
    }
}