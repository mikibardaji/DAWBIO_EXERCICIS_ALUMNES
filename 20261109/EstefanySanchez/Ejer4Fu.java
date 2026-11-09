package ejer4fu;
import java.util.Scanner;
/**
 *
 * @author Estefany.SS
 */
public class Ejer4Fu {

    /**
     * 4. Programa que pide al usuario un número entero 
     * y muestra si es positivo, cero o negativo. Es necesario 
     * crear el método int obteSigne(int x), el cual devuelve -1, 0, +1 según 
     * el número es negativo, cero o positivo, respectivamente.
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        //Pedimos al user un numero entero
        System.out.println("Introduce un numero entero: ");
        int num = lec.nextInt();
        
        //llamamos al método obteSigne y guardamos el resultado
        int resul = obteSigne(num);
        
        //comprobamos el resultado que devuelve el metodo
        if (resul == -1){
            System.out.println("El numero es negativo");
        }else if(resul == 0){
            System.out.println("El nuero es cero");
        }else{
            System.out.println("El numero es positvo");
        }

    
    }
        //metodo que identifica el signo del numero
    public static int obteSigne(int x){
        if (x < 0){
            return -1; //si es negativo, devuelve -1
        }else if(x == 0){
            return 0; // si es cero, devuelve 0
        }else{
            return 1; // si es positivo devuelve 1
        }
    }
    
}
