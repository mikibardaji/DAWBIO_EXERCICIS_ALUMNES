import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();
        System.out.println("Números pares desde 2 hasta " + N + ":");
        for (int r= 2; r<=N; r+=2){
            if (r % 2 == 0){
                System.out.println(r);
            }
        }
    }
}
