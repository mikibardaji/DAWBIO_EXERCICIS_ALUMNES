package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcio;
        do {
            mostraMenu();
            opcio = llegirEnterpositiu("");
            
            switch (opcio) {
                case 0:
                    System.out.println("Fins aviat! Sortint del programa...");
                    break;
                case 1:
                    gestionarRectangles();
                    break;
                case 2:
                    gestionarTriangles();
                    break;
                default:
                    System.out.println("Error: Opció no vàlida. Torna-ho a intentar.\n");
                    break;
            }
        } while (opcio != 0);
        
        scanner.close();
    }

    public static void mostraMenu() {
        
        System.out.println("====== MENÚ PRINCIPAL ======");
        System.out.println("0. Sortir");
        System.out.println("1. Càlculs amb rectangles");
        System.out.println("2. Càlculs amb triangles");
        System.out.print("Escull una opció: ");
    }

    public static double llegirNumeroPositiu(String missatge) {
        double valor;
        while (true) {
            System.out.print(missatge);
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Error: El número ha de ser estrictament positiu (major que 0).\n");
                }
            } else {
        scanner.next(); 
                
            }
        }
    }

    public static int llegirEnterpositiu(String missatge) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                scanner.next(); 
                return -1; 
            }
        }
    }

    public static void gestionarRectangles() {
        System.out.println("\n--- CÀLCULS AMB RECTANGLES ---");
        double base = llegirNumeroPositiu("Introdueix la base del rectangle: ");
        double altura = llegirNumeroPositiu("Introdueix l'altura del rectangle: ");

        double perimetre = calcularPerimetreRectangle(base, altura);
        double area = calcularAreaRectangle(base, altura);

        System.out.printf("Perímetre del rectangle: %.2f\n", perimetre);
        System.out.printf("Àrea del rectangle: %.2f\n\n", area);
    }

    public static double calcularPerimetreRectangle(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double calcularAreaRectangle(double base, double altura) {
        return base * altura;
    }

    public static void gestionarTriangles() {
        System.out.println("\n--- CÀLCULS AMB TRIANGLES ---");
        double base = llegirNumeroPositiu("Introdueix la base del triangle: ");
        double altura = llegirNumeroPositiu("Introdueix l'altura del triangle: ");
        double costat2 = llegirNumeroPositiu("Introdueix el segon costat del triangle: ");
        double costat3 = llegirNumeroPositiu("Introdueix el tercer costat del triangle: ");

        double perimetre = calcularPerimetreTriangle(base, costat2, costat3);
        double area = calcularAreaTriangle(base, altura);

        System.out.printf("Perímetre del triangle: %.2f\n", perimetre);
        System.out.printf("Àrea del triangle: %.2f\n\n", area);
    }

    public static double calcularPerimetreTriangle(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularAreaTriangle(double base, double altura) {
        return (base * altura) / 2.0;
    }
}
