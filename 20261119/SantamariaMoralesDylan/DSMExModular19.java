/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular19;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dylan Santamaria
 */
public class DSMExModular19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercici 19:
        // Programa amb un menú de tres opcions: 0. Sortir. 1. Càlculs amb rectangles 2. Càlculs amb triangles
        // El programa presentarà iterativament el menú a l’usuari perquè esculli una de les opcions fins que esculli sortir.
        // Cal crear un mètode void mostraMenu() per mostrar el menú.
        // Per a cada figura es calcularà el perímetre i l’àrea. Cal fer funcions per:
        // • Demanar cadascuna de les dades d’entrada (si es pot fer reaprofitant en algun cas reaprofitant funcions), 
        //   també la funció de les dades d’entrada sol ha de retornar numeros positius, sino no pot acabar la funció.
        // • Una funció per calcular el perimetre per cada una de les figures. Una per cada figura.
        // • Una funció per calcular l’area de cada figura, una per cada figura.
        // • Crear el main que cridi a cadascuna de les funcions, i que funcioni.
        boolean salir = false;
        double bRectangle, hRectangle, c2, c3, bTriangle, hTriangle;

        do {
            mostraMenu();
            int opcio = demanarOpcio("Escull una opcio: ");
            switch (opcio) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    System.out.println("");
                    System.out.println("--- CALCULS AMB RECTANGLES ---");
                    bRectangle = numeroDoublePositivo("Introdueix la base del rectangle: ");
                    hRectangle = numeroDoublePositivo("Introdueix l'altura del rectangle: ");
                    System.out.println("Perimetre del rectangle: " + perimetreRectangle(bRectangle, hRectangle));
                    System.out.println("Area del rectangle: " + areaRectangle(bRectangle, hRectangle));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("--- CALCULS AMB TRIANGLES ---");
                    bTriangle = numeroDoublePositivo("Introdueix la base del triangle: ");
                    hTriangle = numeroDoublePositivo("Introdueix l'altura del triangle: ");
                    c2 = numeroDoublePositivo("Introdueix el segon costat del triangle: ");
                    c3 = numeroDoublePositivo("Introdueix el tercer costat del triangle: ");
                    System.out.println("Perimetre del triangle: " + perimetreTriangle(bTriangle, c2, c3));
                    System.out.println("Area del triangle: " + areaTriangle(bTriangle, hTriangle));
                    System.out.println(" ");
                    break;
            }

        } while (salir == false);
        
        System.out.println(" ");
        System.out.println("Fins aviat! Sortint del programa...");

    }

    public static double areaTriangle(double b, double h) {
        double area = (b * h) / 2;
        return area;
    }

    public static double perimetreTriangle(double c1, double c2, double c3) {
        double perimetre = c1 + c2 + c3;
        return perimetre;
    }

    public static double areaRectangle(double b, double h) {
        double area = b * h;
        return area;
    }

    public static double perimetreRectangle(double b, double h) {
        double perimetre = b + b + h + h;
        return perimetre;
    }

    public static double numeroDoublePositivo(String pedir) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        double numeroDouble = 0;

        do {
            try {
                System.out.print(pedir);
                numeroDouble = lector.nextDouble();
                if (numeroDouble > 0) {
                    salir = true;
                } else {
                    System.err.println("Has d'introduir un nombre positiu.");
                    System.out.println(" ");
                }

            } catch (InputMismatchException e) {
                System.err.println("Error. Has d'introduir un numero.");
                lector.nextLine();
                System.out.println(" ");
            }
        } while (salir == false);

        return numeroDouble;

    }

    public static void mostraMenu() {
        System.out.println("====== MENU PRINCIPAL ======");
        System.out.println("0. Sortir");
        System.out.println("1. Calculs amb rectangles");
        System.out.println("2. Calculs amb triangles");
    }

    public static int demanarOpcio(String pedir) {
        Scanner lector = new Scanner(System.in);
        int opcio = 5;

        do {
            try {
                System.out.print(pedir);
                opcio = lector.nextInt();

                if (opcio != 0 && opcio != 1 && opcio != 2) {
                    System.err.println("ERROR. Has de posar 0, 1 o 2");
                    System.out.println(" ");
                }

            } catch (InputMismatchException e) {
                System.err.println("ERROR. Has de posar 0, 1 o 2.");
                lector.nextLine();
                System.out.println(" ");
            }

        } while (opcio != 0 && opcio != 1 && opcio != 2);

        return opcio;

    }

}
