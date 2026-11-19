/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modualrex19;

import java.util.Scanner;

/**
 *
 * @author eal0493
 */
public class Modualrex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);

        int opcio = -1;
          while (opcio != 0) {

            mostraMenu();

            System.out.print("Escull una opcio: ");
            opcio = sc.nextInt();

            switch (opcio) {

                case 0:
                    System.out.println("Fins aviat! Sortint del programa...");
                    break;

                case 1: {

                    System.out.println("--- CALCULS AMB RECTANGLES ---");

                    double base = demanaPositiu(sc, "Introdueix la base del rectangle: ");
                    double altura = demanaPositiu(sc, "Introdueix l'altura del rectangle: ");

                    double perimetre = perimetreRectangle(base, altura);
                    double area = areaRectangle(base, altura);

                    System.out.printf("Perimetre del rectangle: %.2f%n", perimetre);
                    System.out.printf("Area del rectangle: %.2f%n", area);

                    break;
                }

                case 2: {

                    System.out.println("--- CALCULS AMB TRIANGLES ---");

                    double base = demanaPositiu(sc, "Introdueix la base del triangle: ");
                    double altura = demanaPositiu(sc, "Introdueix l'altura del triangle: ");
                    double costat2 = demanaPositiu(sc, "Introdueix el segon costat del triangle: ");
                    double costat3 = demanaPositiu(sc, "Introdueix el tercer costat del triangle: ");

                    double perimetre = perimetreTriangle(base, costat2, costat3);
                    double area = areaTriangle(base, altura);

                    System.out.printf("Perimetre del triangle: %.2f%n", perimetre);
                    System.out.printf("Area del triangle: %.2f%n", area);

                    break;
                }

                default:
                    System.out.println("Error: Opcio no valida. Torna-ho a intentar.");
                    break;
            }
        }
    }
    
}
