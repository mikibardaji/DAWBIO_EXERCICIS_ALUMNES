import java.util.Random;
import java.util.Scanner;

public class Ex9_pulsaciones 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int pulsaciones, min, suma;
        double media;

        min=0;
        pulsaciones=0;
        suma=0;

        while (min<5)
        {
            min++;
            System.out.println("Introdueix les pulsacions per minut " + min + ":");
            pulsaciones = sc.nextInt();
            suma = suma + pulsaciones;
        }
        media = (double) suma / 5;
        System.out.println("Mitjana: " + media + " bpm");
    }
}
