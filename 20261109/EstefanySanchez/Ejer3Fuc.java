package ejer3fuc;

import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class Ejer3Fuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        
        // Pedimos el primer número entero 
        System.out.println("Introduce el primer número entero: ");
        int num1 = lec.nextInt();
        
        //Pedimos el sugundo numero
        System.out.println("Introduce el segundo numero: ");
        int num2 = lec.nextInt();
        
        //llamamos al metodo menor y guardamos el resultado 
        int resultado = menor(num1, num2);
        
        //Mostrar cual es el numero menor 
        System.out.println("El numero menor es: " + resultado);
    }
    
        //metodo que recibe dos números y devuelve el menor
    public static int menor(int x, int y) {
        
        // comprobamos si el primer núemro es menor que el sgundo
        if (x < y){
            return x;
            
        }else {
            return y;
        }
    }
    
}
