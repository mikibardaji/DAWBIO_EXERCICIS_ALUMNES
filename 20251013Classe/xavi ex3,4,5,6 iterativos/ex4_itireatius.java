import java.util.Scanner;

public class ex4_itireatius {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        for (int comptador = 1; comptador <= num; comptador += 1) {
            System.out.println(comptador);
        }
    }
}
