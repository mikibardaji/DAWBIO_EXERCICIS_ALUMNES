import java.util.Scanner;

public class ex9_itireatius {
    //pregunta cuantas pulsaciones tiene un paciente en 5 minutos
    //calcula la media de pulsaciones por minuto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pulsacions_min;

        System.out.println("Introdueix pulsacions minut: ");
        pulsacions_min = sc.nextDouble();

        System.out.println("mitjana: "+(pulsacions_min/5)+"bpm");

    }
}
