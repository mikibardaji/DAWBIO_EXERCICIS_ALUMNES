package lanzamientodado;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Estefany.SS
 */
public class LanzamientoDado {

    /**
     * 4. Lanzamiento de un dado
    Haz un programa que simule el lanzamiento de un dado de 6 caras.
    Genera aleatoriamente un número entre 1 y 6 y muestra el resultado.
    Además:
    • Si sale un 6, muestra «¡Has sacado un 6!».
    • Si sale un 1, muestra «¡Qué mala suerte!».
    • En otro caso, muestra «Resultado normal».
    *
    * 
    * 
     */
    public static void main(String[] args) {
    //llamamos random
    int num;
    Random rand = new Random();
    
    num = rand.nextInt(1,7);
    System.out.println("Resultado: " + num);
        
    if(num == 6){
        System.out.println("¡Has sacado un 6!");
    }else if (num == 1){
        System.out.println("¡Que mala suerte!");
    }else{
        System.out.println("Resultado normal");
        
    }
    
    
    }
    
}
