import java.util.Random;

public class eje4B {
    
    public static void main(String[] args) {
        Random rd = new Random();
        int[] numeri = new int[20];

        int sommaPositivi = 0;
        int sommaNegativi = 0;

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = rd.nextInt(0,20) ; 

            if (numeri[i] > 0) {
                sommaPositivi += numeri[i];
            } else if (numeri[i] < 0) {
                sommaNegativi += numeri[i];
            }
        }

        System.out.println("Somma positivi: " + sommaPositivi);
        System.out.println("Somma negativi: " + sommaNegativi);
    }
}


