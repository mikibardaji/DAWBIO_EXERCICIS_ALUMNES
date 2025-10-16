import java.util.Scanner;
public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acum_suma =0, contador =0;
        double media, pulsaciones;

       for (contador = 1; contador <= 5; contador++) {
   System.out.println("Pon tus pulsaciones actuales por minuto :");
   pulsaciones = sc.nextDouble();
    acum_suma += pulsaciones;
 }

 media = (double) acum_suma / 5;
   System.out.println("La media de pulsaciones es de " + media + " bpm ");
   sc.close();

}
}

