package paroimpar;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Estefany.SS
 */
public class ParOimpar {

    /**
    * 3. Par o impar
    Realiza un programa que genere aleatoriamente un número entre 1 y 100.
    El programa debe mostrar el número generado e indicar si es:
    • Par
    • Impar
    Pista: puedes utilizar el operador %, revisa para que sirve.
    Pista: un número es divisible por un número, si su residuo es 0.
    * 
    * 
    */
    public static void main(String[] args) {
        // llamamos random
        Random rand = new Random();
        int num;
        
        num = rand.nextInt(0,101);
        
        System.out.println("Numero generado: " + num);
        
        if(num %2 == 0){
            System.out.println("Es par");
            
        
        }else{ 
            System.out.println("impar");
            
        }
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
