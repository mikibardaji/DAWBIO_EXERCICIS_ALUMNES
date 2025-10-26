package disenymodular;
import java.util.Scanner;
public class ejercici2modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la teva edat: ");
        int edat = sc.nextInt();
        boolean resultat = esMajorEdat(edat);
        System.out.println(resultat);
    }
    public static boolean esMajorEdat(int edat){
        if (edat>=18){
            return true;
        }else{
            return false;
        }
    }
}
