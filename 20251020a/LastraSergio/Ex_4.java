import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {

        PreguntaSigne();
        int x = num1(0);
        obteSigne(0);
        mostraSigne(x);
    }

    public static void PreguntaSigne() {
        System.out.println("Introdueix un numero per saber el seu signe:");
    }

    public static int num1(int x) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    public static int obteSigne(int x) {
        int signe;
        if (x < 0) {
            signe = -1;
            
        } else if (x == 0){
            signe = 0;

        } else {
            signe = 1;

        }
        return signe;
    }

    public static void mostraSigne(int signe) {
        if (signe == -1) {
            System.out.println("El numero es negatiu.");
        } else if (signe == 0) {
            System.out.println("El numero es zero.");
        } else {
            System.out.println("El numero es positiu.");
        }
    }
}
