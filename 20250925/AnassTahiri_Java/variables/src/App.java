import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         Scanner sc = new Scanner(System.in);

        double precio = 3.5;
        double iva_anyadido = 2.4;
        double descuento = 2.5;
       
         
    

        System.out.println(" Precio sin IVA: ");
        precio = sc.nextDouble();

        System.out.println(" precio con IVA: ");
        iva_anyadido = sc.nextDouble();

        System.out.print("Introduce Descuento ");
        descuento = sc.nextDouble();

        

        double precio_total = precio + iva_anyadido - descuento; 


        System.out.println("el precio total es de " + precio_total);
        System.out.println("El precio con iva es " + iva_anyadido);
        System.out.println("Descuento aplicado "+ descuento);
        System.out.println("Precio total "+ precio_total);
       



           
        
    }
}
 