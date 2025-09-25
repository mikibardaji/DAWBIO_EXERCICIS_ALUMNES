import java.util.Scanner;

public class GiovineMayorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        // declaro las variables num1 num2
        // Pido al usuario cual es el valor de cada variable 
        // luego escribo los condicionales comparando cual es el numero mas grande
        // el numero mas grande lo muestro en pantalla
        // si ningun numero es mayor muestro en pantalla que tienen el mismo valor

        int num1;
        int num2;

        System.out.println("primer numero");
        num1 = sc.nextInt();
        System.out.println("segundo numero");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("el numero mayos es " + num1);
        } else if (num1 > num2) {
            System.out.println("el numero mayos es " + num2);
        } else {
            System.out.println("tienen el mismo valor " + num1);
        }
        sc.close();
    }
}
