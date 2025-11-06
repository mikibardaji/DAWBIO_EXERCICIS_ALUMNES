import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
    //Programa que demana a l’usuari una distància mesurada en milles i mostra el seu equivalent en quilòmetres (1 milla = 1,6093 km). Ha d’implementar un mètode amb el prototip double millesAKm(int milles).
    
    double milles, km; 
    milles = nMilles();
    km = millesAKm(milles);
    resultat(km);

}

private static double nMilles() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dona'm un valor en milles: ");
    double nMilles = sc.nextDouble();
    return nMilles;
}

private static double millesAKm(double milles) {
    double millesAKm = milles * 1.6093;
    return millesAKm;
}
private static void resultat(double km) {
    System.out.println("El valor en km és: " +Math.round(km) + " km.");
}
}