import java.util.Scanner;

public class BaltasarCastro_ex10 {
public static void main(String[] args) {
    //Programa que calcula el salari net mensual d'un treballador en funció del nombre d'hores treballades i la taxa d'impostos 
    //d'acord amb les hipòtesis següents:
    //Les primeres 130 hores es paguen a tarifa normal (15,00 €/h).
    //Les hores que passin de 130 es paguen a 1,5 vegades la tarifa normal.
	//Les taxes d'impostos són:
    //Els 500 primers euros són lliures d'impostos.
    //Els 400 següents tenen un 25% d'impostos.
    //La resta un 45% d'impostos. Escriure nom, salari brut, taxes i salari net.


    Scanner sc = new Scanner (System.in);
    
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
    }
}
