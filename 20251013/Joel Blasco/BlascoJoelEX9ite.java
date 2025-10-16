import java.util.Random;

public class BlascoJoelEX9ite {
    public static void main(String[] args) {

        Random rd = new Random();
        double sumapulsacio = 0;
        
        for(int cont = 0; cont <= 5; cont += 1){
            int pulsacio = rd.nextInt(30,151);
            System.out.println("Pulsacio minut " + cont + " es de: " + pulsacio + ".");
            sumapulsacio = sumapulsacio + pulsacio;
            }
            double mitjana = sumapulsacio/5;
        System.out.println("La suma de les pulsacions es de " + sumapulsacio + " i la mitjana es de " + mitjana);
    }
}