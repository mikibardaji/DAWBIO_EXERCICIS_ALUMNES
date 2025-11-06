import java.util.Scanner;

public class ex_6 {
 public static void main(String[] args) {
        System.out.print("Introdueix un valor per x: ");
        int x = num1(0);
        System.out.print("Introdueix un valor per y: ");
        int y = num2(0);
        compara(x, y);
    }

    public static int num1(int x) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        return x;
    }

    public static int num2(int y) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        return y;
    }

    public static int compara(int x, int y){

        int cmp = Integer.compare(x, y);

        if (cmp < 0){
            System.out.println(x + " Es menor que " + y);
        }
        else if (cmp > 0){
            System.out.println(x + " Es mayor que " + y);
        }
        else {
            System.out.println(x + " Es igual que " + y);
        }

        return cmp;
    }
}
