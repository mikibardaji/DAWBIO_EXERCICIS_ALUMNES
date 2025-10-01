import java.util.Scanner;

public class alansalcedo10 {
    public static void main(String[] args) {
        //escribir la variable de horas trabajadas
        //escribir la variable de la tarifa
        //sacar if para hacer el salario bruto mas las horas extras
        //sacar los impostues y el salario neto

         Scanner sc = new Scanner(System.in);

       
        System.out.print("Introdueix el nombre d'hores treballades: ");
        int hores = sc.nextInt();

        double tarifa = 15.0;
        double salariBrut;

        
        if (hores <= 130) {
            salariBrut = hores * tarifa;
        } else {
            int horesExtra = hores - 130;
            salariBrut = (130 * tarifa) + (horesExtra * tarifa * 1.5);
        }

        
        double impostos = 0;
        if (salariBrut > 500) {
            double restant = salariBrut - 500;
            if (restant <= 400) {
                impostos = restant * 0.25;
            } else {
                impostos = 400 * 0.25; 
            }
        }
        double salariNet = salariBrut - impostos;
        System.out.println("Salari brut: " + salariBrut);
        System.out.println("Impostos: " + impostos);
        System.out.println("Salari net: " + salariNet);
        sc.close();
    }
}
