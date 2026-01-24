import java.util.Random;

public class eje4A {
    
    public static void main(String[] args) {
        Random rd = new Random();
        int[] numeri = new int[20];

        int positivi = 0;
        int negativi = 0;

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = rd.nextInt(0,20) ; 

            if (numeri[i] > 0) {
                positivi++;
            } else if (numeri[i] < 0) {
                negativi++;
            }
        }

        System.out.println("Numeri positivi: " + positivi);
        System.out.println("Numeri negativi: " + negativi);
    }
}


