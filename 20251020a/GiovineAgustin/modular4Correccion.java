import java.util.Scanner;
public class modular4Correccion {
    public static void obteSigne(int x){
        if (x < 0) {
            System.out.println("el numero ingresado es negativo");
        } else if (x > 0) {
            System.out.println("el numero ingresado es positivo");
        } else {
            System.out.println("el numero ingresado es cero"); 
        }
    }
    public static int valor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }
    public static void main(String[] args) {
        
        obteSigne(valor());
    }
}
