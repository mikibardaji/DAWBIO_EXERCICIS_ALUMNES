package ejer7fuc;
import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class Ejer7Fuc {

    /**
     * 7. Programa que pregunta al usuario precios de artículos hasta que decide
     * no continuar (hay que preguntar a cada iteración) y muestra el precio con 
     * IVA (21%). Implementa el método float precioAmbIva(float precio).
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        String cont = "si";
        
        // Repetimos mientras el usuario quiera continnuar 
        while (cont.equalsIgnoreCase("si")){//equalsIgnoreCase permite escribir si, SI o Si
        
        //preguntamos el precio del articulo
            System.out.println("Introduce el precio del artículo: ");
            float precio = lec.nextFloat();
        
        //llamamos a la función para calcular el precio con IVA
            float resul = preuAmbIva(precio);
        
        //mostramos el precio final
            System.out.println("El precio con IVA es: " + resul + " €");
        
        //preguntamos si quiere introducir otro artículo
            System.out.println("Quieres introducir otro artículo? (si/no)");
            cont = lec.next();
        
    
    }
        System.out.println("Programa finalizado.");
    }
    //funcion que calcula el precio con IVA 
    public static float preuAmbIva(float preu){
        float precioF = preu * 1.21f;
        return precioF;
    }
    
}
