import java.util.Scanner;
//5.	Programa que llegeix dos números i els visualitza en ordre ascendent.(crescente)
// Declara dos variables (num1, num2)
// Haz el if
// mostra resultado
public class MartinaNicettoEx5{

       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double num1,num2;
         System.out.println("Dime un numero ");
         num1 = sc.nextDouble();
         System.out.println("Dime otro numero ");
         num2 = sc.nextDouble();

         if (num1>num2)
         {
            System.out.print(num1 + " ");
            System.out.print(num2);
        }
        else 
            {
                System.out.print(num2 + "");
               System.out.print(num1);
            }
            }
    
}
