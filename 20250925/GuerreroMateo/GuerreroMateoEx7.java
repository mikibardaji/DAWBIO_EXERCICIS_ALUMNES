import java.util.Scanner;

public class GuerreroMateoEx7 {
    public static void main(String[] args) throws Exception {
        int numero;
        int numero2;
        int numero3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduce el primer numero:");
        numero = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        numero3 = sc.nextInt();

        if (numero>numero2 && numero>numero3) {
            System.out.println("El numero " + numero + " es el mes gran ");
            
        }else if (numero2<numero && numero2>numero3) {
            System.out.println("El numero " + numero2 + " es el mes gran");
            
        }else{
            System.out.println("El numero " + numero3 + " es el mes gran");
        }

    }
}
