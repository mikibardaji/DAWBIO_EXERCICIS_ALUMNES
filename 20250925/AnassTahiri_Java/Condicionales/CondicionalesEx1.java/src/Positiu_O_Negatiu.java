import java.util.Scanner;

public class Positiu_O_Negatiu {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        double num;

        num = sc.nextDouble();

        if (num > 0){
            System.out.println("El numero es positivo");

        }else if(num <0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }

        }


        
}