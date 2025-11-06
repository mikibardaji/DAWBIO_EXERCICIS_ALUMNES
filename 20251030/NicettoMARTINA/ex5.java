import java.util.Scanner;

public class ex5 {
    //5.	Programa que demana a l’usuari una distància mesurada en milles i mostra el seu equivalent en quilòmetres (1 milla = 1,6093 km).
    // Ha d’implementar un mètode amb el prototip double millesAKm(int milles).
 
    public static void main(String[] args) {
        
             double milles = pidedistancia();      
            double km = converti(milles);         
            mostra(km);  

}

    private static double pidedistancia()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto es la distancia en milles? ");
        double distancia=sc.nextDouble();
        return distancia;
    }
    private static double converti(double milles)
    {
        double km=milles*1.6093;
        return km;
    }
    private static void mostra(double km)
    {
        System.out.println(" La distancia en km es: " + km );
    }

}