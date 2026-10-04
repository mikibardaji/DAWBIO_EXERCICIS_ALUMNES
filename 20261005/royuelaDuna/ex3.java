
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {     
    
    int num1, num2;
    Scanner lector = new Scanner (System.in);

    System.out.println("Digues 1 número del 1 al 100");
    num1= lector.nextInt();
    System.out.println("Digues un altre número del 1 al 100");
    num2= lector.nextInt();
    if (num1>num2) {
        System.out.print("El numero " + num1 + " es mes gran.");

    }else{
        System.out.print("El numero " + num2 + " es mes gran.");

        
    }
}
}
