import java.util.Scanner;

public class Ex2_dosi_medicament_while 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int dosi;
        System.out.println("Quantes dosis necesites? ");
        dosi =sc.nextInt();
        while (dosi>0)
        {
            dosi--;
            System.out.println("Dosis administrada t'en falten " + dosi);
        }
        System.out.println("Ja estas curat!!!");
    }
}
