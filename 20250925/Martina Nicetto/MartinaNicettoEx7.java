import java.util.Scanner;
//7. Programa que llegeix 3 numeros i ens diu quien es el mes gran
// Declarar tres numeros
// Hacer el if que dice quien es el mas grande y visualizar el mas grande
// Mostrar resultado

public class MartinaNicettoEx7 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         double num1,num2,num3;
         System.out.println("Dime un numero ");
         num1 = sc.nextDouble();
         System.out.println("Dime un numero ");
         num2 = sc.nextDouble();
         System.out.println("Dime un numero");
         num3= sc.nextDouble();

        if (num1 >= num2 && num1 >= num3) 
        {
            System.out.println("El numero mas grande es " + num1);
        } 
        else if (num2 >= num1 && num2 >= num3) 
        {
            System.out.println("El numero mas grande es " + num2);
        } 
        else 
        {
            System.out.println("El numero mas grande es " + num3);
        }
    }
    
}