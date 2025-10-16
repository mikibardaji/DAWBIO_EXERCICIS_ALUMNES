import java.util.Random;

public class BlascoJoelEX10ite {
    public static void main(String[] args) {

        Random rd = new Random();
        float temp;
        float min = 100;
        float max = 0;
        int intents = 0;
        do{
            temp = rd.nextFloat(30,41);
            System.out.println("La temperatura donada es de: " + temp);
            if(temp < min){
                min = temp;
            }
            if(temp > max && temp < 36.5){
                max = temp;
            }
            intents += 1;
        }
        while(temp < 36.5);
        System.out.println("Han sortit " + intents + " intents.");
        System.out.println("La temperatura minima es de: " + min);
        System.out.println("La temperatura maxima es de: " + max);
    }
}