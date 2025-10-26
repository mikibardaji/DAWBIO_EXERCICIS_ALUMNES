package disenymodular;
import java.util.Scanner;
public class ejercici1modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Di un numero: ");
        int numero=sc.nextInt();
        System.out.print("Di un altre numero: ");
        int numero2=sc.nextInt();
        double resultat = producte(numero,numero2);
        System.out.println(resultat);
    }

public static double producte(double x, double y){
     return x*y;
}
}
