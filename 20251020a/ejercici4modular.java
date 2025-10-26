package disenymodular;
import java.util.Scanner;
public class ejercici4modular {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un numero enter: ");
        int numero = sc.nextInt();
        int resultat = obteSigne(numero);
        System.out.println("El numero es (1,0,-1): " + resultat);
    }
    public static int obteSigne(int numero){
        if (numero<0){
            return -1;
        }else if (numero==0){
            return 0;
        }else{
            return 1;
        }

    }
}
