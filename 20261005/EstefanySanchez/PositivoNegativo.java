package positivonegativo;
import java.util.Scanner;
/**
 *
 * @author Estefany.SS
 */
public class PositivoNegativo {

    /**
     * 4. Programa que lee un número y dice si es
     * positivo, si es cero, o bien y es negativos.
     */
    public static void main(String[] args) {
        // declaramos variables
        int posNeg;
        Scanner lector = new Scanner(System.in);
        
        //Escribimos numero
        System.out.println("Tu numero es positivo, cero o negativo");
        System.out.println("Tu numero es: ");
        posNeg = lector.nextInt();
        
        //usamos if, else
        if(posNeg > 0){
            System.out.println("El numero es positivo: ");
            
        }else if(posNeg == 0){ 
            System.out.println("El numero es 0: ");
            
        }else{
            System.out.println("El numero es negativo");
        }
       
       
        
        
    }
    
}
