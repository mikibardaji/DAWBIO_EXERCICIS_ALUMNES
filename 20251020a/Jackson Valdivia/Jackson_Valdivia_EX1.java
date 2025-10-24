import java.util.Scanner;

public class reals{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero real: ");
        double uno = sc.nextDouble();
        System.out.println("introduzca el segundo numero real");
        double dos = sc.nextDouble();
        
        double respuesta = producte(uno, dos);
        System.out.println("el producto es: " + respuesta);
    }

    public static double producte(double x, double y){
        double producto;
        producto = x * y;
        return producto;}

}
