import java.util.Scanner;
public class CedenoAdrianEx7 {
    public static void main(String[] args) {
    
        //Pedir 3 numeros 
        //Decir cual es mas grande
    Scanner sc = new Scanner(System.in);
    double numero1,numero2,numero3,mayor;

    System.out.println("Dime el numero 1:");
    numero1 = sc.nextDouble();

    System.out.println("Dime el numero 2:");
    numero2 = sc.nextDouble();

    System.out.println("Dime el numero 3:");
    numero3 = sc.nextDouble();

        if (numero1 > numero2 && numero1 > numero3)
        {
        mayor = numero1;
        }
        else if (numero2 > numero1 && numero2 > numero3)
        {
        mayor = numero2;
        }
        else
        {
        mayor = numero3;
        }

        System.out.println("El numero mas grande es: " + mayor);

    sc.close();
}
}
