import java.util.Scanner;

public class GuerreroMateoEx10 {
    public static void main(String[] args) {

        float temperatura = 0;
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);
        while (temperatura <36.5) {
            System.out.println("Introduce temperatura: ");
            temperatura = sc.nextFloat();
            contador++;
            
        }
        System.out.println("Total mediciones = " + contador);
        sc.close();
    }
}
