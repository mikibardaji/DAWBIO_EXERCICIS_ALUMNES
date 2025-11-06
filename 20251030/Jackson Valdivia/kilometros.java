import java.util.Scanner;

public class kilometros{
    public static void main(String[] args) {
        final double km = 1.6093;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la distancia en millas: ");
        double milla = sc.nextInt();

        double finall = millasAkm(milla, km);

        System.out.println("La distancia "+ milla +" en kilometros es: "+ finall+ "km");
    }


    public static double millasAkm(double millas, double km){
        return millas * km;
    }


}