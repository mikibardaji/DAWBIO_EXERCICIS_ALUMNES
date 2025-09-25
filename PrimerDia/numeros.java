import java.util.Scanner;
//3.	Programa que llegeix 2 números i en mostra el més gran.
// Declarar variables num1, num2
// Preguntar valor variables
//Hacer un if donde dices si num1>num2 resultado num1 es el mayor
//fai un else se num2>num1 resultado num2 es el mayor
public class numeros{
     public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    double num1,num2;
    
    System.out.print("Primer numero ");
    num1=sc.nextDouble();
    System.out.print("Segundo numero ");
    num2=sc.nextDouble();
        if (num1>num2)
        {
            System.out.println("El primer numero es mas grande");
        }
       else if (num2>num1)
        {
            System.out.println("El segundo numero es mas grande");
        }
        
    }
}