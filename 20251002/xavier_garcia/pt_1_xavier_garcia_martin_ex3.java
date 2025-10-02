import java.util.Scanner;

public class pt_1_xavier_garcia_martin_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        double precio = 7.50;
        double iva = 1.21;
        double total = 0;
        double totalIva = 0;
        
        System.err.println("1 entrada- sin descuento");
        System.err.println("2 entrada- 10% descuento");
        System.err.println("3+ entrada- 5% descuento");

        System.err.println("cuantas entradas quieres?");
        entrada = sc.nextInt();

        if(entrada == 1){
            total = precio * entrada;
            totalIva = total * iva;
        }else if(entrada == 2){
            total = entrada*(precio -(precio * 0.10));
            totalIva = total * iva;
        }else if(entrada >= 3){
            total = entrada * (precio -(precio * 0.05));
            totalIva = total * iva;
        }

        System.err.println("el precio base es: " + precio + "€");
        System.err.println("el precio total es: " + total + "€");
        System.err.println("el precio total con iva es: " + totalIva + "€");
    }
}
