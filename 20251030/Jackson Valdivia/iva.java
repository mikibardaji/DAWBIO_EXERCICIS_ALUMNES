import java.util.Scanner;

public class iva {
    public static void main(String[] args) {
        final double iva = 1.21;
        double precio;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca el precio de su producto: ");
            precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("el precio final es: " + (precioIVA(precio, iva)));
            System.out.println("Desea ver el precio de otro producto? (S/N)");
            respuesta = sc.nextLine();
            
        } while (respuesta.equals("S"));
    }

    public static double precioIVA(double precio, double iva){
        return precio * iva;
    }
}
