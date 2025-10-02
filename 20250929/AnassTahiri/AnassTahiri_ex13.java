import java.util.Scanner;

public class AnassTahiri_ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros;

        System.err.println("Introduce una cantidad en euros: ");
        euros = sc.nextInt();

        System.out.println("A que moneda quieres convertirlo? ");
        System.out.println("1-dolar");
        System.out.println("2-pesos");

        int moneda = sc.nextInt();
        if (moneda == 1) {
            System.out.println(euros + " euros son " + (euros * 1.1) + " dolares");
        } else if (moneda == 2) {
            System.out.println(euros + " euros son " + (euros * 20.5) + " pesos");
        } else {
            System.out.println("moneda no valida");
            
        }
    }
}