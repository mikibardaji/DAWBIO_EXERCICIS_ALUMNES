import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Que numero quieres utilizar primero");
        int numero = sc.nextInt();

       

        for( int contador = 2 ; contador < numero ; contador += 2) {
            System.out.println("Los numeros pares desde " + numero + " son " + contador );
        }

    }
}
