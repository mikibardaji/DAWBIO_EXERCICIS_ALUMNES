import java.util.Scanner;

public class MateoGuerrero_ej3 {
    public static void main(String[] args) throws Exception {
        
        //Pedir numero 1
        //Pedir numero 2
        // si numero es mayor a numero 2 printar numero
        // de lo contrario printar numero 2
        int numero;
        int numero2;
        System.out.println("Hola, ingresa un numero para continuar:");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        System.out.println("Ingrese otro numero:");
        numero2 = sc.nextInt();
        if (numero>numero2) {
            System.out.println(numero);
            
        }else{
            System.out.println(numero2);
        }

    }
}
