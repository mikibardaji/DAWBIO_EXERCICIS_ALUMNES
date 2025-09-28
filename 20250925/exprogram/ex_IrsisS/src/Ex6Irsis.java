import java.util.Scanner;

public class Ex6Irsis {
    public static void main(String[] args)  {
       

   //Programa que llegeix dos números i ens diu quin és el més gran o si són iguals.
   //Declarar variables: valor1, valor2.

   Scanner sc = new Scanner(System.in);
   double valor1, valor2;

   System.out.println("Afegeix un número: ");
   valor1 = sc.nextDouble();
   System.out.print("Afegeix un altre número: ");
   valor2 = sc.nextDouble();

   // si el número 1 és més gran que el número 2:
   if (valor1>valor2)
   {
    System.out.println("El nombre més gran és: " + valor1);
   }
   // si el número 2 és més gran que el número 1:
   else if (valor1<valor2)
   {
    System.out.println("El nombre més gran és: " + valor2);
   }
   // si el número 1 és igual al número 2:
   else
   {
    System.out.println("Els nombres són iguals: " + valor1 + ", " + valor2);
   }
}
}