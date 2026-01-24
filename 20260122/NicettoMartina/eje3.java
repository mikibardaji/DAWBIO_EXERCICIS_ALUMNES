import java.util.Random;

public class eje3{
    public static void main(String[] args) {
     
        Random rd = new Random();

        double[] numeros;
        numeros = new double[20];

        for (int i = 0; i < numeros.length; i++) {
          
            numeros[i] = rd.nextDouble(0,20);   
        }

        double max = numeros[0];
        double min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);
    }
}
