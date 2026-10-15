/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jocdaus;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class JocDaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int aposta, dau1, dau2, suma, premi;

        System.out.print("Quants diners vols apostar? ");
        aposta = lector.nextInt();

        if (aposta <= 0) {
            System.out.println("L'aposta ha de ser superior a 0 euros.");
        } else {

            dau1 = random.nextInt(6) + 1;
            dau2 = random.nextInt(6) + 1;
            suma = dau1 + dau2;

            System.out.println("Primer dau: " + dau1);
            System.out.println("Segon dau: " + dau2);

            if (suma == 7) {
                premi = aposta;
                System.out.println("Bravo! Has guanyat " + premi + " euros");

            } else if (dau1 == dau2) {

                System.out.println("Has tret un doble! Tornem a tirar.");

                dau1 = random.nextInt(6) + 1;
                dau2 = random.nextInt(6) + 1;

                System.out.println("Primer dau: " + dau1);
                System.out.println("Segon dau: " + dau2);

                if (dau1 == dau2) {
                    premi = aposta * 3;
                    System.out.println("COMBO! Tripliques ganacies, has guanyat " + premi + " euros");
                } else {
                    premi = aposta * 2;
                    System.out.println("Has doblat el valor: guanyes " + premi + " euros");
                }

            } else {
                System.out.println("Has perdut l'aposta");
            }
        }
    }
    
}
