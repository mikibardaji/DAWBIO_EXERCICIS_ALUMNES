import java.util.Scanner;

public class Ej5_dis {

    public static void main(String[] args) {
        double millas = leerMill();
        double km = convertirAKM(millas);
        mostrarKilometros(km);
    }

    public static double leerMill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la distancia (en millas): ");
        double valorMillas = sc.nextDouble();
        sc.close();
        return valorMillas;
    }

    public static double convertirAKM(double millas) {
        return millas * 1.6093;
    }

    
    public static void mostrarKilometros(double km) {
        System.out.printf("La distancia equivalente en kilómetros es: %.2f km\n", km);
    }
}
