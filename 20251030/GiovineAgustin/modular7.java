import java.util.Scanner;

public class modular7 {
 public static void main(String[] args) {
        float total = precioTotal();
        float precioFinal = precioConIva(total);
        System.out.printf("El precio total con IVA incluido es: " +precioFinal);
    }

    public static float precioTotal(){
        Scanner sc = new Scanner(System.in);
        float total = 0f;

        while (true){
            System.out.print("introduce el precio de cada producto e introduce 0 para finalizar: ");
            float precio = sc.nextFloat();

            if (precio == 0f){
                break;
            } else {
                total += precio;
            }
        }
        sc.close();
        return total;
    }
    public static float precioConIva(float precio){
        return precio * 1.21f;
    }
}