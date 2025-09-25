import java.util.Scanner;

public class IrsisSanchez_Ex4 {
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
// Programa que llegeix un número i diu si és positiu, si és zero, o bé i és negatiu.
// Una variable: valor1
double valor1;
System.out.println("Dona'm un valor: ");
valor1 = sc.nextDouble();

if (valor1>0)
{
System.out.println("El numero és positiu.");
}
if (valor1<0)
{
 System.out.println("El numero és negatiu.");
}
if (valor1==0)
{
 System.out.println("El numero és zero.");
}

}
}
