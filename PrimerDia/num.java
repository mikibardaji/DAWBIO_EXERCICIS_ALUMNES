import java.util.Scanner;
//4.	Programa que llegeix un número i diu si és positiu, si és zero, o bé i és negatiu.
// Declarar variables num1, num2
// Preguntar valor variables
//Hacer un if donde dices si num1<0  resultado num1 es negativo/zero/positivo

public class num{
     public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    double num1;
    
    System.out.print("El numero es");
    num1=sc.nextDouble();
  
        if (num1>0)
        {
            System.out.println("Numero positivo");
        }
       else if (num1==0)
        {
            System.out.println("Zero");
        }
        else if (num1<0)
        {
            System.out.println("Negativo");
        }
        
    }
}