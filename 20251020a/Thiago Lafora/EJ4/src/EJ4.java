import java.util.Scanner;

public class EJ4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, signe;

        System.out.println("Pon un numero entero: ");
        num = sc.nextInt();

        signe = obteSigne(num);

        if (signe == -1) {
            System.out.println("Es negativo");
        } else if (signe == 0) {
            System.out.println("Es cero.");
        } else {
            System.out.println("Es positivo.");
        }

        sc.close();
    }

  
    private static int obteSigne(int x)
    {
        if (x < 0) {
            return -1;
        } else if (x == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
