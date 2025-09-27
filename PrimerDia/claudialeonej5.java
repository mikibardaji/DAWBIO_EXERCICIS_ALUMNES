import java.util.Scanner;
public class claudialeonej5 {
    public static void main(String[] args) throws Exception {
 //Programa que te dice en orden ascendente 2 numeros.
    //Programa pregunta usuario los dos numeros
    //Poner las variables y los if or else
    //Hacer que el programa diga el orden ascendente de los numeros
 Scanner sc= new Scanner(System.in); 
 double number1, number2;
 System.out.print("Di un numero: ");
 number1=sc.nextDouble();
 System.out.print("Di otro numero: ");
 number2=sc.nextDouble();
 if (number1>number2){
    System.out.print("El orden ascendente es: " + number2 + ", " + number1);
    }
else {
    System.out.print("El orden ascendente es: " + number1 + ", " + number2);
    }
    }
}
