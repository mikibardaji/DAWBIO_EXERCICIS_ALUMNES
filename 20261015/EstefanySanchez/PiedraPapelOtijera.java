package piedrapapelotijera;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Estefany.SS
 */
public class PiedraPapelOtijera {

    /**
     * 6. Piedra / Papel / Tijera
Pide al usuario que te pregunte si elige “piedra, papel o tijera”:
0: Piedra 1:Papel 2:Tijera
Luego genera un número aleatorio entre 0 y 2 que simule la tirada del ordenador.
Muéstrala por pantalla.
Muestra por pantalla quién ha ganado:
Ejemplo de resultado:
Elige tu jugada (0: Piedra, 1: Papel, 2: Tijera): 1
Tú has elegido: Papel
El ordenador ha elegido: Piedra
Resultado: ¡Has ganado tú! 
________________________________________________________________________________
Elige tu jugada (0: Piedra, 1: Papel, 2: Tijera): 2
Tú has elegido: Tijera
El ordenador ha elegido: Tijera
Resultado: ¡Empat!
________________________________________________________________________________
Elige tu jugada (0: Piedra, 1: Papel, 2: Tijera): 0
Tú has elegido: Piedra
El ordenador ha elegido: Papel
Resultado: ¡Ha ganado el ordenador!
     */
    public static void main(String[] args) {
    //llamamos a random y Scanner y variables
    Scanner lector = new Scanner(System.in);
    Random rand = new Random();
    
    int user;
    int maqui;
    
    //Escribimos
        System.out.println("Elige tu jugada (0: Piedra, 1: papel, 2:Tijera: )");
        user = lector.nextInt();
    //Genera num alea entre 0 y 2
    maqui = rand.nextInt(3);
    
    
    //Mostrar eleccion del user usamos if else if y else
        System.out.println("Tu has elegido: ");
        if (user == 0){
            System.out.println("Piedra");
        }else if (user == 1){
            System.out.println("Papel");
        }else if(user == 2){
            System.out.println("Tijera");
        }else{
            System.out.println("Opcion no valida");
        }
        
    //Mostrar la eleccion de la maquina usamos if else if 
        System.out.println("El ordenador a elegido: ");
        if(maqui == 0){
            System.out.println("Piedra");
        }else if(maqui == 1){
            System.out.println("Papel");
        }else if(maqui == 2){
            System.out.println("Tijera");
            
        }
        
        //Quien gana
        if(user == maqui){
            System.out.println("Resultado: ¡Empate!");
        }else if ((user == 0 && maqui == 2) || 
                 (user == 1 && maqui == 0) ||
                 (user == 2 && maqui == 1)){
            System.out.println("Resultado: ¡Has ganado tú!");
        }else{
            System.out.println("Resultado: ¡Ha ganado el ordenador!");
        }
        
        
        
    
    
    
    
    
    
    
    }
    
}
