package cajaregi;
import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class CajaRegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lec = new Scanner(System.in);
    
    double total = 0;
    boolean conti = true;
    
    while (conti){
        
        try {
            System.out.println("Introduce el precio del producto (0 para terminar): ");
            
            String entrada = lec.nextLine();
            
            double precio = Double.parseDouble(entrada);
            
            if (precio == 0){
                conti = false;
                
            }else{
                total = total + precio;
            }
            
            
        }catch(NumberFormatException e){
            System.out.println("Error de formato. Operación cancelada por seguridad.");
            conti = false;
           }
           System.out.println("Total de la compra: " + total);
        }
    
    
    
    }
    
}
    
