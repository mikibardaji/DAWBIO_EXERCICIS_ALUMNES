import java.util.Random;

public class actividad9 {
    public static void main(String[] args) {
         Random random = new Random(); 
        int suma = 0;                 
        int pulsacion;               

        System.out.println("Simulació de pulsacions durant 5 minuts:");

        
        for (int i = 1; i <= 5; i++) {
            
            pulsacion = random.nextInt(121) + 30; 
            
            
            System.out.println("Minut " + i + ": " + pulsacion + " batecs per minut");

            
            suma += pulsacion;
        }
        double mitjana = (double) suma / 5;

        System.out.println("La mitjana de pulsacions és: " + mitjana);
        

    }
}
