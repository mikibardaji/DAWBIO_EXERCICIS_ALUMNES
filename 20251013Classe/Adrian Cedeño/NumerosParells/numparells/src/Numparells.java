import java.util.Scanner;
public class Numparells {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Introduce un numero ");
    numero = sc.nextInt();

    for (int contador = 2; contador < numero ; contador += 2)
    System.out.println("los numeros pares desde " + numero + " son " + contador);

    sc.close();
    }
}
