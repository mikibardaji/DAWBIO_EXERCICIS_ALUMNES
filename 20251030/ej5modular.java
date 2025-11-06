import java.util.Scanner;

public class ej5modular{

public static void main (String[]Args){
    //prog demana distancia en milles i el mostra en kilometres (1 milla= 1,6093km)
    //metode double millesAKm(int milles).
    double milles =pregunta();
    double kilometros = millesAKm(milles);
    resultat(milles, kilometros);
}
    public static double pregunta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introdueix la distància en milles: ");
        double millesog=sc.nextDouble();
        return millesog;
    }
    public static double millesAKm(double milles){
        double kilometros= milles*1.6093;
        return kilometros;
    }
    

    public static void resultat(double milles, double kilometros){
        System.out.println("La distancia en kilometros de " + milles + " milles es de: " + kilometros + " km.");
    }
    

}