import java.util.Scanner;
public class thiago_lafora_T11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio, efectivo, deuda, vuelto;

        System.out.println("Mostrar el precio del producto");
        precio = sc.nextInt();
        System.out.println("Mostrar la cantidad de efectivo que tienes");
        efectivo = sc.nextInt();

        deuda = precio - efectivo;
        vuelto = efectivo - precio;

        if (precio >= efectivo) 
        {
            System.out.println("Cantidad faltante: " + deuda);
        } 
        else if (efectivo > precio) 
        {
            System.out.println("Tu vuelto es: " + vuelto);
        }
        else {
            System.out.println("No puedes comprar el producto");
        }

    }
}
