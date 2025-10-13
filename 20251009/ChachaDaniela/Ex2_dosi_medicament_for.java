import java.util.Scanner;

public class Ex2_dosi_medicament_for 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int dosi,vegades;
        System.out.println("Quantes dosis necesites? ");
        dosi = sc.nextInt();

        for (vegades=0;  dosi>vegades; dosi--)
        {
            System.out.println("Dosis administrada t'en falten " + (dosi-1));
        }
        System.out.println("Ja estas curat!!!");
    }
}
