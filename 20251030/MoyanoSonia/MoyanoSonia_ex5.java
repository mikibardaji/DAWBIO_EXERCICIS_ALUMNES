import java.util.Scanner;
public class millesAKilometres {
public static void main(String[] args) {
    
int milles;
double km;
milles=demanaMilles();
km=millesAKm(milles);
mostrarTexte(milles, km);

}//final del main

// Solicitar millas
public static int demanaMilles (){
int milles;
Scanner sc = new Scanner(System.in);
System.out.print("Quines milles vols transformar?:");
milles = sc.nextInt();
return milles;
}
//convertir milles a Km
public static double millesAKm (int milles){
final double FACTOR_CONVERSION= 1.60934;
double km;
km=milles*FACTOR_CONVERSION;
return km;
}
//Mostrar resultat
public static void mostrarTexte(int milles, double km){
System.out.print(milles+" milles són "+km+" Kilòmetres");
return;
}
}
