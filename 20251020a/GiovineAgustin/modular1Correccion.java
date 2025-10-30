import java.util.Scanner;

public class modular1Correccion {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1, num2, resultado;

    num1 = PedirNumero();
    num2 = PedirNumero();

    resultado = producte(num1, num2);

    System.out.println("La multiplicacion es " + resultado);
}

public static double producte(double x, double y){
    double multi = x * y;
    return multi;
}

public static double PedirNumero(){
    Scanner sc = new Scanner(System.in);
    double x;

    do {
        
    System.out.println("pon un numero ");
    x = sc.nextDouble();

    } while (x < 0);
    return x; 
}
}
