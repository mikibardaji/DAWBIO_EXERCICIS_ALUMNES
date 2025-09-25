import java.util.Scanner;

public class mayor {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");
        numero1 = sc.nextInt();
        System.out.println("introduzca otro numero");
        numero2 = sc.nextInt();

        if(numero1 > numero2){

            System.out.println("el numero " + numero1 + " es mayor");

        } else if (numero1 < numero2){
            System.out.println("el numero " + numero2 + " es mayor");
        } else {
            System.out.println("ambos son iguales");
        }
    }
}
