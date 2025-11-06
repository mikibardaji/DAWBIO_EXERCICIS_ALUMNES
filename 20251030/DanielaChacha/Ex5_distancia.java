import java.util.Scanner;

public class Ex5_distancia
{
    public static void main(String[] args) 
    {
        double distMillas=pedirDistanciaMillas();
        double conversion=calculoMillasKm(distMillas);
        mostrarResultado(conversion);
    }
    public static double pedirDistanciaMillas ()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Pon una distancia en millas: ");
        double distanciaMillas=sc.nextDouble();
        return distanciaMillas;
    }
    public static double calculoMillasKm (double x)
    {
        double distancia = x*1.6093;
        return distancia;
    }
    public static void mostrarResultado(double km)
    {
        System.out.println("Tu distancia en quilometros es de " + km);
    }
}