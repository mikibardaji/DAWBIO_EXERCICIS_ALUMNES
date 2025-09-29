import java.util.Scanner;

public class ElMesGran_AnassTahiri {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int num1,num2;
    System.out.println("Introduce el primer número para comparar:");

        num1 = sc.nextInt();

    System.out.println("Introduce el segundo número para comparar:");

        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El número mayor es: " + num1);
        }else if (num2 > num1){
            System.out.println("El número mayor es: " + num2);
        }else{ 
            System.out.println("Ambos números son iguales.");
        }



        }
}