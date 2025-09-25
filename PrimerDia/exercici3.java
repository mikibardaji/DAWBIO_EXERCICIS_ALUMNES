import java.util.Scanner;

public class exercici3 {
public static void main(String[] args) throws Exception {

 Scanner sc = new Scanner(System.in);
 //Programa que llegeix 2 números i en mostra el més gran.
 //Dues variables: valor1, valor2.
 double valor1, valor2;
 System.out.println("Dona'm un valor:");
 valor1 = sc.nextDouble();
 System.out.println("Dona'm un altre valor:");
 valor2 = sc.nextDouble();
 System.out.println("Quin valor és més gran?");

 if (valor1>valor2)
 {
    System.out.println("El número més gran és: " + valor1);
 }
 if (valor1<valor2)
 {
    System.out.println("El número més gran és: " + valor2);
 }
}
}
