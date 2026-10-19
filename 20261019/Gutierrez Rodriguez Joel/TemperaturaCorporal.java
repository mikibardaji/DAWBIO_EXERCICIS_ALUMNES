/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturacorporal;

/**
 *
 * @author jgu3417
 */

import java.util.Scanner;

public class TemperaturaCorporal {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        float temperatura = 0;
        int mesures = 0;

        while (temperatura < 36.5) {
            System.out.print("Introdueix temperatura: ");
            temperatura = lector.nextFloat();

            mesures++;
        }

        System.out.println("Han calgut " + mesures + " mesures.");

        lector.close();
    }
}

