import java.util.Random;
public class ejiteratius9 {
    public static void main(String[] args) {
         Random rd = new Random();
            int pulsacions;
            int acum=0;

           for (int i = 1; i <= 5; i++) {
            pulsacions = rd.nextInt(151) + 30;
            System.out.println("Les pulsasions per minut " + i + ": " + pulsacions);
            acum += pulsacions;
           }
            double mitjana = acum / 5.0;
            System.out.println("La mitjana dels batecs es " + mitjana + "bpm");
}
}
