import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();
        System.out.println("Números pares desde 1 hasta " + N + ":");
        for (int r= 1; r<=N; r+=1){
            if (r % 1 == 0){
                System.out.println(r);
            }
        }
    }
}
