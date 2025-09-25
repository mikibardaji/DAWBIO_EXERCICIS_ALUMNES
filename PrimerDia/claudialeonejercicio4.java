import java.util.Scanner;
public class claudialeonejercicio4 {
     public static void main (String[] args) throws Exception {
// Programa que te dice el numero mas grande
//Preguntar al usuario los dos numeros
//Poner las variables y el if
//Hacer que el programa diga cual es el mas grande
Scanner sc= new Scanner(System.in);
double number1, number2;
 System.out.print("Di un numero:");
 number1=sc.nextDouble();
 System.out.print("Di otro numero:");
 number2=sc.nextDouble();
 if (number1>number2){
    System.out.print("El numero mas grande es " + number1);
}

else{
    System.out.println("El numero mas grande es " + number2);
    }
            }
}

