package nummasgrande;
import java.util.Scanner;

/**
 *
 * @author Estefany.SS
 */
public class NumMasGrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //3. Programa que lee 2 números y muestra el mayor.
   //declaromos variables 
    int num1;
    int num2;
    Scanner lector = new Scanner(System.in);
    
    
    //Ingresamos numero 1 y 2
    System.out.println("Ingresa el numero 1: ");
    num1 = lector.nextInt();
    
    System.out.println("Ingresa el numero 2: ");
    num2 = lector.nextInt();
    
   
    
  //Hacemos ejercicios de if y else
  
  if (num1 > num2){
      System.out.println("numero mas grande es: " + num1);
  }else{
      System.out.println("numero mas grande es: " + num2);
  }

    }
}
