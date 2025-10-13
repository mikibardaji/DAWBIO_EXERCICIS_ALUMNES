import java.util.Scanner;

public class Ex6_tension_arterial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int tensio, contador, negativo;
        contador=0;
        negativo=0;

        do 
        {
            System.out.println("Posa la tensió arterial: ");
            tensio= sc.nextInt();
            contador++;
            if (tensio<0)
            {
                negativo++;
            }
        }
        while (contador<=5);
        if (negativo>0)
        {
            System.out.println("Has introducido un valor negativo");
        }
    }    
}
