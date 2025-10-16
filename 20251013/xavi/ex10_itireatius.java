import java.util.Scanner;

public class ex10_itireatius {
    //programa pide temperatura
    //si es menor a 36.5 repite y suma uno a un contado
    //al poner una temperatura mayor terminara y mostrara los intentos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp;
        int intentos=0;
        
        do {
            System.out.println("Introduce la temperatura corporal: ");
            temp = sc.nextFloat();
            intentos++;
        } while (temp < 36.5);
        System.out.println(intentos + " intentos.");
    }
}
