import java.util.Scanner;

public class Ejercicio_7_Eduardo_Rodriguez {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = 10, critic = 0;

        for (int contador = 0; contador < 20; contador ++) {
            System.out.println("Dime un Valor de presion arterial: ");
            valor = sc.nextInt();
            if (valor < 0) {
                System.out.println("Se ha detectado un error critico");
                critic++;
            }
        }
        if (critic>=1) {
            System.out.println("Hay valores criticos");
        }
        else {
            System.out.println("Todos los valores son correctos");
        }
        
    }
}
