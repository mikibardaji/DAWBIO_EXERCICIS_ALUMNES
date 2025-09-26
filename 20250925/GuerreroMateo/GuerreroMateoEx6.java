import java.util.Scanner;

public class MateoGuerrero_ej6 {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduce un numero:");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        numero2= sc.nextInt();

        if (numero1>numero2) {
            System.out.println("El numero " + numero1 + " es el mes gran ");
            
        }else if (numero1<numero2) {
            System.out.println("El numero " + numero2 + " es el mes gran ");
            
        }else{
            System.out.println("Els dos son iguals");
        }

    }
}
