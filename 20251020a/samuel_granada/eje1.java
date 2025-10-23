import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        double residuo, x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el primer numero ");
        x = sc.nextDouble();
        System.out.println("dime el segundo numero ");
        y = sc.nextDouble();
        System.out.println("este es el residuo: " +producto(x, y));
    }
     public static double producto(double x, double y) {
        double residuo=0;

        residuo = x*y;

        return residuo;
    }
}