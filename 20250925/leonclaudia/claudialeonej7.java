import java.util.Scanner;
public class claudialeonej7 {
    public static void main(String[] args) throws Exception {
    //Programa que te dice que numero es mas grande.
    //Programa pregunta usuario los tres numeros
    //Poner las variables y los if or else
    //Hacer que el programa diga que numero es el mas grande.
    Scanner sc= new Scanner(System.in); 
    double number1, number2, number3;
    System.out.print("Di un numero: ");
    number1=sc.nextDouble();
    System.out.print("Di otro numero: ");
    number2=sc.nextDouble();
    System.out.print("Di otro numero: ");
    number3=sc.nextDouble();
    if (number1>number2 && number1>number3){
    System.out.print("El numero mas grande es: " + number1);
    }
    if (number2>number1 && number2>number3){
        System.out.print("El numero mas grande es: " + number2);
        }
    if (number3>number1 && number3>number2) {
        System.out.print("El numero mas grande es: " + number3);
        } 
   } 
}
