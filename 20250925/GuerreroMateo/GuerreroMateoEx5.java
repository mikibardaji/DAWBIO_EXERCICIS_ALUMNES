import java.util.Scanner;

public class GuerreroMateoEx5 {
    public static void main(String[] args) throws Exception {
        int numero;
        int numero2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, ingresa el primer numero para continuar");
        numero = sc.nextInt();
        System.out.println("Perfecto, ahora el segundo");
        numero2 = sc.nextInt();

        if (numero<numero2) {
            System.out.print(numero + " - ");
            System.out.print(numero2);
        }else{
            System.out.print(numero2 + " - ");
            System.out.print(numero);
        }
        
    }
}
