import java.util.Scanner;

public class thiago_lafora_T6 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc =new Scanner(System.in);
               double numero1, numero2;
        
               System.out.println("Que numero tienes en mente?");
               numero1 = sc.nextDouble();
               System.out.println("Con cual numero lo quieres comparar?");
               numero2 = sc.nextDouble();
 
    if (numero1 > numero2)                

    {
        System.out.println("Numero " + numero1 +" es mayor que " + numero2);

    }
    else if (numero1 == numero2)
    {
        System.out.println("Numero " + numero1 + " es igual a " + numero2);
        
    }   

    else 
    {
        System.out.println("El número " + numero2 + " es mayor que " + numero1);
    }
    sc.close();
 }
 }
    

