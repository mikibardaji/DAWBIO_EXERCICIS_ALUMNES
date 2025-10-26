package disenymodular;
import java.util.Scanner;
public class ejercici3modular {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Di un numero: ");
    int numero= sc.nextInt();
    System.out.print("Di un altre numero: ");
    int numero2= sc.nextInt();
    int resultat = menor(numero, numero2);
    System.out.println("El numero mes petit es: " + resultat);
        
    }
    public static int menor(int numero, int numero2){
        if (numero>numero2){
            return numero2;
        }else{
            return numero;
        }

    }
}
