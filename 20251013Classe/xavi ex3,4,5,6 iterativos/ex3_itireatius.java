import java.util.Scanner;

public class ex3_itireatius {
    //val num
    //mostrar los numeros parejos comprendidos entre 1 numeros
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        for (int comptador = 2; comptador <= num; comptador += 2) {
            System.out.println(comptador);
        }
    }
}
