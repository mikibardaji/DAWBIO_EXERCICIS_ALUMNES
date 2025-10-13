package Ejercicios;

import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes dosis necessites? ");
        int dosis = sc.nextInt();

        int i = dosis;
        do {
            System.out.println("Dosi administrada t'en falten " + (i - 1) + "...");
            i--;
        } while (i > 0);

        System.out.println("Ja estàs curat!!!");
        sc.close();
    }
}