import java.util.Scanner;
public class claudialeonej6 {
    public static void main(String[] args) throws Exception {
    //Programa que te dice que numero es mas grande o si son iguales.
    //Programa pregunta usuario los dos numeros
    //Poner las variables y los if or else
    //Hacer que el programa diga que numero es el mas grande o si son iguales.
    Scanner sc= new Scanner(System.in); 
    double number1, number2;
    System.out.print("Di un numero: ");
    number1=sc.nextDouble();
    System.out.print("Di otro numero: ");
    number2=sc.nextDouble();
    if (number1>number2){
        System.out.print("El numero més gran es " + number1);
        }
    if (number2>number1){
        System.out.print("El numero més gran es " + number2);
        }
    else {
        System.out.print("Els dos numeros són iguals.");
        }
    }
}
