import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int contador=0;
        int pulsaciones;
        int suma=0;
        double media;

        while(contador<5)
        {
        System.out.println("Cuantas pulsaciones tienes? ");
        pulsaciones=sc.nextInt();


        if(pulsaciones>=30 && pulsaciones<=150)
        {
        suma+=pulsaciones;
        contador++;
        }
        }

        media=suma/5;

        System.out.println("Media " + media);


         
}
}
