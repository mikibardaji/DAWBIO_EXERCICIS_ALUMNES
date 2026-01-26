import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jva2780
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros;
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce 20 numeros reales");
       numeros = new int[20];
       int minimo = numeros[0];
       int maximo = numeros[0];
       int cantidadpositivos = 0;
       int cantidadnegativos = 0;
       int valortotal = 0;
       int sumapositivos = 0;
       int sumanegativos = 0;
       
       for(int i = 0; i <numeros.length; i++){
           numeros[i] = sc.nextInt();
       }
       
       for(int i = 0; i <numeros.length; i++){
           
           System.out.println("El array numero " +  i + " tiene el valor: " + numeros[i]);
           valortotal += numeros[i];
           
           if(numeros[i] > 0 ){
               sumapositivos += numeros[i];
               cantidadpositivos++;
           }else if(numeros[i] < 0){
               sumanegativos += numeros[i];
               cantidadnegativos++;
           
           }
           
           
           
           if(numeros[i] < minimo ){
               minimo = numeros[i];
           }
           
           if(numeros[i] > maximo){
               maximo = numeros[i];
           }
       }
       
       
       
       
       System.out.println("El numero mayor del array es: " + maximo);
       System.out.println("El numero menor del array es: " + minimo);
       System.out.println("El numero de numeros negativos es: " + cantidadnegativos);
       System.out.println("El numero de numeros positivos es: " + cantidadpositivos);
       System.out.println("Valor tota: " + valortotal);
       System.out.println("suma negativos: " + sumanegativos);
       System.out.println("suma positivos: " + sumapositivos);
       
       
       
    
    
    
    
    }
    
}
