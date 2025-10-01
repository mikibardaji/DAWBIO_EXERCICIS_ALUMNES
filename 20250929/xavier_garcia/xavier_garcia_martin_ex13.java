import java.util.Scanner;

public class xavier_garcia_martin_ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int euros;

        System.err.println("Introduce una cantidad en euros: ");
        euros = scanner.nextInt();

        System.out.println("a que moneda quieres convertirlo? ");
        System.out.println("1-dolar");
        System.out.println("2-pesos");

        int moneda = scanner.nextInt();
        if (moneda == 1) {
            System.out.println(euros + " euros son " + (euros * 1.1) + " dolares");
        } else if (moneda == 2) {
            System.out.println(euros + " euros son " + (euros * 20.5) + " pesos");
        } else {
            System.out.println("moneda no valida");
            
        }
    }
}
