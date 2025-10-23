import java.util.Scanner;

public class eje2 {
    public static void main(String[] args) {
        int edad;
        edad = leer(0);
        esMajorEdat(edad);
        
    }
    public static int leer(int edad) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu edad ");
        edad = sc.nextInt();
        return edad;
    }
    public static boolean esMajorEdat(int edad){
        boolean mayor = false;
        if (edad >= 18){
            mayor = true;
        System.out.println("eres mayor");
        }else if (edad <18){
            mayor= false;
            System.out.println("eres menor");
        }
        return mayor;
    }
}
