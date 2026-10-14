package dosdados;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Estefany.SS
 */
public class DosDados {

    /**
     * 5. Juego de dados
    Simula un juego de dos dados. Genera aleatoriamente dos números entre 1 y 6.
    El programa te pedirá cuánto dinero quieres apostar.
    • Si la suma de los dos números es 7 ganarás lo mismo que has apostado. Muestra: 
    * "¡Bravo! Has ganado X euros" (cambia la X por el valor conseguido)
    • Si los dos números son iguales volverá a echar de nuevo:
    * 
    * 
    ◦ Si vuelve a salir un doble (dos números iguales) ganas el triple que has apostado. Muestra:
    * "¡COMBO! Triplicas ganacias, has ganado X euros"
    ◦ Cualquier otro resultado ganas el doble. Muestra “Has doblado el valor: ganas X euros”
    • Si no la suma no es 7 ni es un doble muestra: "Has perdido la apuesta".
    *
    * 
    * 
     */
    public static void main(String[] args) {
        // declaramos variables
        //llamamos Random y Scanner
    int num1;
    int num2;
    int apostar;
    Scanner lector = new Scanner(System.in);
    
    Random rand = new Random();
    
    //Preguntamos al user
    System.out.println("Cuanto dinero quieres apostar: ");
    apostar = lector.nextInt();
    
    //lanzamos dados
    num1 = rand.nextInt(1,7);
    num2 = rand.nextInt(1,7);
    
    System.out.println("primer dado: " + num1);
    System.out.println("segundo dado: " + num2);
    
   
    //if else if y else
    if(num1 + num2 == 7){
        System.out.println("¡Bravo! Has ganado" + apostar + "euros");
    }else if(num1 == num2){
        System.out.println("Vuelve hechar de nuvo");
        
        //tiramos dados de nuevo
        num1 = rand.nextInt(1,7);
        num2 = rand.nextInt(1,7);
        
        System.out.println("primer dado: " + num1);
        System.out.println("segundo dado: " + num2);
        
        //si sale igual triplicamos la apuesta
        if(num1 == num2){
            System.out.println("¡COMBO! Triplicas ganacias, has ganado" + (apostar *3)  + "euros");//hacemos el calculo multi *3
            
        }else{
            System.out.println("Has doblado el valor: ganas " +(apostar * 2)+ "euros"); //hacemos el calculo multi *2
        }
    }else{
            System.out.println("Has perdido la apuesta");
        }
        
        
        
    
        
        
    }
   
    
    
   
        
    

    
    
    }
    

