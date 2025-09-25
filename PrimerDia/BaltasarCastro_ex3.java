import java.util.Scanner;

public class BaltasarCastro_ex3 {
public static void main(String[] args) {
    //Programa que llegeix 2 números i en mostra el més gran.
    //Pedir numero 1
    //Pedir numero 2
    //Ver si el numero 1 es major
    //Ver si el segundo numero es major
    //Comprobar si son iguales

    Scanner sc = new Scanner (System.in); 

double valor1;
double valor2;

System.out.println("Que numero quieres?");
    valor1 = sc.nextDouble();

System.out.println("Que otro numero quieres?");
    valor2 = sc.nextDouble();

     if (valor1 > valor2) 
     {
            System.out.println(+ valor1);
        } 
        
    if (valor1 < valor2) 
     {
            System.out.println(+ valor2);
        } 

    else
     {
            System.out.println("Son iguales");
        } 
}
}
