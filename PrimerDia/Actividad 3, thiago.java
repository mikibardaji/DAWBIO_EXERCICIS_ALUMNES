import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
               double numero1, numero2;
        
               System.out.println("Que numero tienes en mente?");
               numero1 = sc.nextDouble();

               System.out.println("Que numero quieres comprobar?");
               numero2 = sc.nextDouble();
 
    if (numero1>numero2)                

    {
        System.out.println("Numero 1 es mayor que numero 2");

    }
    else if (numero1<numero2)
    {
        System.out.println("Numero 1 es menor que numero 2");
        
    }   

    else 
    {
        System.out.println("El numero 1 es igual que numero 2");
    }
    sc.close();
 }
 }
 

