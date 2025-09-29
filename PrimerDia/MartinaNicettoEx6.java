import java.util.Scanner;
//6. Programa que llegeix dos numeros i ens diu quien es el mes gran o si son iguals
// Declarar dos numeros
// Hacer el if que dice quien es el mas grande y visualizar el mas grande/decir si son iguales
// Mostrar resultado

public class MartinaNicettoEx6 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         double num1,num2;
         System.out.println("Dime un numero ");
         num1 = sc.nextDouble();
         System.out.println("Dime otro numero ");
         num2 = sc.nextDouble();

         if (num1>num2)
         {
            System.out.println("El numero mas grande es " + num1);
         else if
            {
                System.out.println("El numero mas grande es " + num2);
            }
        else
            {
                System.out.println("Los numeros son iguales");
            }
    }
}