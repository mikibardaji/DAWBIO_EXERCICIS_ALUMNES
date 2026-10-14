package caracruz;
import java.util.Random;

/**
 *
 * @author Estefany.SS
 */
public class CaraCruz {

    /**
     * 2. Cara o cruz
    Realiza un programa que simule el lanzamiento de una moneda.
    Genera aleatoriamente un 0 o un 1:
    • 0 representa cara. Escribe en pantalla “Cara”
    • 1 representa cruz. Escribe en pantalla “Cruz”
    * 
    * 
     */
    public static void main(String[] args) {
   //llamamos al objeto Random
    int lanza;
    Random rand = new Random();
    lanza = rand.nextInt(2);
    
    //if else if
    if(lanza == 0){
        System.out.println("Cara");
    }else{
        System.out.println("Cruz");
        
        
   }
    
  }
        
}
    