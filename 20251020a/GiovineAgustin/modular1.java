import java.util.Scanner;

public class modular1 {

    public static void producto(double num1, double num2) {
        Scanner sc = new Scanner(System.in);
        double resultado;
        resultado = num1 * num2;
        System.out.println("el producto de los dos numeros ingresados es " + resultado);

        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        producto(2.2,2);
        sc.close();
    }
}
