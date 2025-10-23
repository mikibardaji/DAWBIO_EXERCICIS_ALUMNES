import java.util.Scanner;

public class Ex1_2num_resultat 
{
    public static void main(String[] args)
    {
        double op_multi;
        op_multi= multi();
        System.out.println("El resultado es " + op_multi);

    } 
    private static double multi()
    {
        double numb1, numb2, op_multi;
        Scanner sc = new Scanner (System.in);
        System.out.println("Número 1: ");
        numb1= sc.nextDouble();
        System.out.println("Número 2: ");
        numb2= sc.nextDouble();
        op_multi= numb1*numb2;

        return op_multi;
    }
}