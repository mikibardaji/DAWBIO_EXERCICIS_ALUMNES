import java.util.Scanner;
public class modular4 {
    public static void obteSigne(int x){
        Scanner sc = new Scanner(System.in);

        if (x < 0) {
            System.out.println("el numero ingresado es negativo");
        } else if (x > 0) {
            System.out.println("el numero ingresado es positivo");
        } else {
            System.out.println("el numero ingresado es cero"); 
        }

        sc.close();
        
    }
    public static void main(String[] args) {
        obteSigne(10);
    }
}
