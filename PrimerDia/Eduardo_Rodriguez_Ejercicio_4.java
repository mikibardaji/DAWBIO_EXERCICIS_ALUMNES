import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("");
        System.out.println("Dime un numero: ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        }
        else if (num == 0) {
            System.out.println("El numero es 0");
        }
        else {
            System.out.println("El numero es negativo");
            
        }
    }
}
