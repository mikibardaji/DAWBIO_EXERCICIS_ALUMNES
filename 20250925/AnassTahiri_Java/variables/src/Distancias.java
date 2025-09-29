import java.util.Scanner;

public class Distancias {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int laps,distance_lap,total_distance,Km_distance,metros_de_mas;
        final int METROS_KM = 1000;

          System.out.println("Introduce vueltas: ");
        laps = sc.nextInt();
        System.out.println("Metros del circuito");
        distance_lap = sc.nextInt();
        System.out.println("Los Km que has echo");

        total_distance = distance_lap*laps;
        
        Km_distance = total_distance/1000;


        System.out.println("la distancia total es de " + total_distance + " Metros ") ;
        System.out.println("la distancia en Km es de " + Km_distance + " km");
        
    }
}
 