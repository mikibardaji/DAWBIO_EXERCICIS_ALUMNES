import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        
        System.out.println("el area del cuadrado " + area);
    }
}
 