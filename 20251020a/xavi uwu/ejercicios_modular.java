package modular;
import java.util.Scanner;

public class ejercicios_modular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0,b=0;
        //ex1--------------------------------------------------
        System.out.print("Introdueix el primer número: ");
        a = sc.nextDouble();
        System.out.print("Introdueix el segon número: ");
        b = sc.nextDouble();
        System.out.println(ex1(a, b));
        //-----------------------------------------------------
        //ex2--------------------------------------------------
        int edat;
        System.out.print("edad");
        edat = sc.nextInt();

        if (ex2mayor(edat)) {
            System.out.println("major");
        } else {
            System.out.println("menor");
        }
        //------------------------------------------------------
        //ex3---------------------------------------------------
        int x,y;
        System.out.print("num 1");
        x = sc.nextInt();
        System.out.print("num 2  ");
        y = sc.nextInt();

        System.out.println("a ella le gutan menoreeee" + ex3menor(x, y));
        //------------------------------------------------------
        //ex4---------------------------------------------------
        int s;
        System.out.print("pone algo pelotudo ");
        s = sc.nextInt();

        if (ex4signo(s) == 1) {
            System.out.println("positivo");
        } else if (ex4signo(s) == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negativo");
        }
        //-------------------------------------------------------
    }


    public static double ex1(double a ,double b){
        return a * b; 
    }

    public static boolean ex2mayor (int edat) {
        return edat >= 18;
    }

    public static int ex3menor(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int ex4signo(int a) {
        if (a > 0) return 1;
        else if (a == 0) return 0;
        else return -1;
    }
}
