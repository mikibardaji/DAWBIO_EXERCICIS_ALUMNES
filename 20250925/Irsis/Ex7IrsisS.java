import java.util.Scanner;
public class Ex7IrsisS {

 public static void main(String[] args)  {
       

//Programa que llegeix tres números diferents i ens diu quin és el més gran.
 //Declarar variables: valor1, valor2, valor3.

Scanner sc = new Scanner(System.in);
double valor1, valor2, valor3;
  
//entrada de datos
System.out.println("Afegeix un número: ");
valor1 = sc.nextDouble();
System.out.print("Afegeix un segon número: ");
valor2 = sc.nextDouble();
System.out.print("Afegeix un tercer número: ");
valor3 = sc.nextDouble();
  
//procesar datos
   // si el valor1 és més gran que el valor2 i valor3:
   if(valor1>=valor2 && valor1>=valor3)
   {
    System.out.println("El valor més gran és: " + valor1);
   }
   // si el valor2 és més gran que el valor1 i el valor3:
   if (valor1<=valor2 && valor2>=valor3)
   {
    System.out.println("El valor més gran és: " + valor2);
   }
   // si el valor3 és més gran que el valor1 i el valor2:
   if (valor1>=valor2 && valor1<=valor3)
   {
    System.out.println("El valor més gran és: " + valor3);
   }

}
}

