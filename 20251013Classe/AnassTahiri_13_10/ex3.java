import java.util.Scanner;

public class ex3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        int i = 2;
        
        System.out.println("Introdueix un número natural N :");

        N = sc.nextInt();

        System.out.println(" Numeros parells entre 1 i " + N + " :");

        
        while (i <= N) {
            System.out.println(i);
            i += 2;
        }

    }
}