import java.util.Scanner;

public class GuerreroMateoEx3 {
    public static void main(String[] args) {
        pedirNum();
        menor(0, 0);
    }

    public static void pedirNum(){
        System.out.println("Ingresa 2 numeros");
    }

    public static int menor(int x, int y){
        int menor = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        if (x >= y) {
            System.out.println(y + " Es menor");
        } else {
            System.out.println(x + " Es menor");
        }
        return menor;
    }
}