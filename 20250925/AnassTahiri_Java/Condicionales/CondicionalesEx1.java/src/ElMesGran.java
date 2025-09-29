import java.util.Scanner;

public class ElMesGran {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        System.out.println("Introduce el primer numero: ");

        num1 = sc.nextInt();

        System.out.println("Introduce el segon numero");

        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El numero mes gran es: " + num1);
        }else if (num2 > num1){
            System.out.println("El numero mes gran es: " + num2);
        }else{
            System.out.println("Los numeros son iguales");
        }



        }
}