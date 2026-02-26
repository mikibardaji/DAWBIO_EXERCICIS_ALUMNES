import java.util.Random;
import java.util.Scanner;

public class ExerciciRandom 
{
    public static void main(String[] args) 
    {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int posicionLista=0;
        
        int[] vector = 
        {
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11)
        };

        do 
        {
            try
            {
                System.out.println("Introduce una posición del vector ");
                posicionLista=sc.nextInt();
                System.out.println("El valor de la posición" + posicionLista + " de tu vector es: " + vector[posicionLista]);
            }
            catch(Exception e)
            {
                System.out.println("Se ha producido un error: " + e.getMessage());
            }
        }while(posicionLista>0);
    }
}
