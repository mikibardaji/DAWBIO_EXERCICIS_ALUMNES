import java.util.Random;

public class ejiteratius10 {
    public static void main(String[] args) {
     Random rd = new Random();
     double temperatura;
     int contador=0;

     do{
         temperatura = 35 + rd.nextDouble() * 10; 
         contador ++;
         System.out.println("Introdueix temperatura del pacient: " + temperatura);
     }while (temperatura<36.5);
     System.out.println("Han calgut " + contador + "intents.");
}
}

