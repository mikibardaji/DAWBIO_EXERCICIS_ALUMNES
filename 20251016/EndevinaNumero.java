import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numeroSecret = (int) (Math.random() * 100) + 1; 
        int intent;
        int intents = 0;
        
        System.out.println("He pensat un número entre 1 i 100. Intenta endevinar-lo!");
        
        do {
            System.out.print("Introdueix un número: ");
            intent = input.nextInt();
            intents++;
            
            if (intent < numeroSecret) {
                System.out.println("El número a endevinar és més gran.");
            } else if (intent > numeroSecret) {
                System.out.println("El número a endevinar és més petit.");
            } else {
                System.out.println("Correcte! Has endevinat el número en " + intents + " intents.");
            }
        } while (intent != numeroSecret);
        
       
    }
}
 
    

