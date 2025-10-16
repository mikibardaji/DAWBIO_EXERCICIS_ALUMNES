import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int acum_suma = 0, contador = 0;
    double bpm, pulsaciones;

    for (contador = 1; contador <= 5; contador++) 
    {
    System.out.println("Pulsaciones por minuto? :");
    pulsaciones = sc.nextDouble();
    acum_suma += pulsaciones;
    }

   bpm = (double) acum_suma / 5;
   System.out.println("La media de pulsaciones por minuto es de " + bpm + " bpm ");
   sc.close();

}
}