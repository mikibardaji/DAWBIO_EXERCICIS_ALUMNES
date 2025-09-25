import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
               double numero1;
        
               System.out.println("Que numero tienes en mente?");
               numero1 = sc.nextDouble();
 
    if (numero1 > 0)                

    {
        System.out.println("Numero 1 es positivo");

    }
    else if (numero1 < 0)
    {
        System.out.println("Numero 1 es negativo");
        
    }   

    else 
    {
        System.out.println("El numero 1 es cero");
    }
    sc.close();
 }
 }