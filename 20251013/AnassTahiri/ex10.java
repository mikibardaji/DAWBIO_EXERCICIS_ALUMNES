import java.util.Scanner;

public class ex10 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tem = 0;
        int intentos = 0;

        do {
            System.out.println("Introdueix la temperatura del pacient:");
            tem = sc.nextFloat();
            intentos++;
        } while (tem < 36.5);
        System.out.println("Has tardado " + intentos + " veces. ");

        
    }
}