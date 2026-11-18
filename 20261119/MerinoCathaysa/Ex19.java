/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu;

        do {
            mostrarMenu();
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 0:
                    System.out.println("¡Hasta pronto! Saliendo del programa...");
                    break;
                case 1:
                    calcularRectangulo();
                    break;
                case 2:
                    calcularTriangulo();
                    break;
                default:
                    System.out.println("Opción no válida. Vuelve a intentarlo");
            }

        } while (opcionMenu != 0);
    }

    public static void mostrarMenu() {
        System.out.println("====== MENÚ PRINCIPAL ======");
        System.out.println("0. Salir");
        System.out.println("1. Cálculos con rectángulos");
        System.out.println("2. Cálculos con triángulos");
    }

    public static double pedirNumeroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double numero;

        do {
            System.out.println(mensaje);
            numero = sc.nextDouble();

            if (numero <= 0) {
                System.out.println("Error: el número debe ser mayor que 0.");
            }

        } while (numero <= 0);

        return numero;
    }

    public static void calcularRectangulo() {
        double base, altura;

        System.out.println("--- CÁLCULOS CON RECTÁNGULOS ---");

        base = pedirNumeroPositivo("Dime la base del rectángulo:");
        altura = pedirNumeroPositivo("Dime la altura del rectángulo:");

        double perimetro = perimetroRectangulo(base, altura);
        double area = areaRectangulo(base, altura);

        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);
    }

    public static double perimetroRectangulo(double base, double altura) {
        return (base + altura) * 2;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static void calcularTriangulo() {
        double base, altura, lado2, lado3;

        System.out.println("--- CÁLCULOS CON TRIÁNGULOS ---");

        base = pedirNumeroPositivo("Dime la base del triángulo:");
        altura = pedirNumeroPositivo("Dime la altura del triángulo:");
        lado2 = pedirNumeroPositivo("Dime el segundo lado del triángulo:");
        lado3 = pedirNumeroPositivo("Dime el tercer lado del triángulo:");

        double perimetro = perimetroTriangulo(base, lado2, lado3);
        double area = areaTriangulo(base, altura);

        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);
    }

    public static double perimetroTriangulo(double base, double lado2, double lado3) {
        return base + lado2 + lado3;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}