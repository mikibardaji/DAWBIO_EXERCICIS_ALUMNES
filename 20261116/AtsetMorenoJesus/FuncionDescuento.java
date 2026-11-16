/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciondescuento;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jat0264
 */
public class FuncionDescuento {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        double precio = pedirDouble("Dime el precio del producto: ");
        while (precio <= 0) {
            System.out.println("El precio tiene que ser mayor que 0");
            precio = pedirDouble("Dime el precio del producto: ");
        }

        double descuento = pedirDouble("Dime el descuento del producto: ");
        while (descuento < 0 || descuento > precio) {
            System.out.println("El descuento tiene que estar entre 0 y el precio original");
            descuento = pedirDouble("Dime el descuento del producto: ");
        }

        double porcentaje = calcularPorcentaje(precio, descuento);
        System.out.printf("El porcentaje de descuento es: %.2f%%%n", porcentaje);
        System.out.printf("El precio final es: %.2f €%n", precio - descuento);
    }

    public static double pedirDouble(String mensaje) {
        double numero = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            try {
                numero = lector.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Tienes que escribir un número");
                lector.next();
            }
        } while (!valido);
        return numero;
    }

    public static double calcularPorcentaje(double precio, double descuento) {
        return descuento * 100 / precio;
    }
}