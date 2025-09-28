import java.util.Scanner;
public class CedenoAdrianEx5 {
    public static void main(String[] args){
    
        //Pedir 2 numeros 
        //Colocarlos de forma ascendente
    Scanner sc = new Scanner(System.in);
    double numero1,numero2;

    System.out.println("Dime el numero 1: ");
    numero1 = sc.nextDouble();

    System.out.println("Dime el numero 2: ");
    numero2 = sc.nextDouble();

    if (numero1>numero2)
    {
    System.out.println("El numero mas grande es: " + numero1);
    System.out.println("El numero mas pequeño es: " + numero2);
    }
    else if ( numero1 < numero2)
    {
    System.out.println("El numero mas grande es: " + numero2);
    System.out.println("El numero mas pequeño es: " + numero1);
    }
    else
    {
    System.out.println("Los dos numeros son iguales");
    }
}
}
