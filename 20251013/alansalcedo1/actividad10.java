import java.util.Random;

public class actividad10 {
    public static void main(String[] args) {
         Random random = new Random(); 
        float temperatura = 0;        
        int intentos = 0;             

        System.out.println("Midiendo la temperatura del paciente...\n");
        
        while (temperatura < 36.5) {
            temperatura = 35 + random.nextFloat() * 10;
            intentos = intentos + 1; 
            System.out.println("Intento " + intentos + ": " + temperatura + " °C");
        }

        System.out.println("\n¡La temperatura es normal!");
        System.out.println("Se han necesitado " + intentos + " intentos.");
    }
}
