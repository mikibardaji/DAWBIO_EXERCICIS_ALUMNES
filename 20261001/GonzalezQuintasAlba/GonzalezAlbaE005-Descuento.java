/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio_nominal,precio_real,dto=0.0;
        final double CIEN=100;
        
        System.out.println("Introduzca el precio nominal del producto en euros");
        Scanner lector=new Scanner(System.in);
        precio_nominal=lector.nextDouble();
        System.out.println("Introduzca el precio real del producto en euros");
        precio_real=lector.nextDouble();
        dto=CIEN*((precio_nominal-precio_real)/precio_nominal);
        System.out.println("Hemos hecho un descuento del "+dto+ "%. El precio nominal es "+precio_nominal+ " euros y el precio real es "+precio_real+" euros");
    }
    
}
