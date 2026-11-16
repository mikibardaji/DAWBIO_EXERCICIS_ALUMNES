/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class Ejercicio12 {

    public static double descuento(double precio, double precioDescuento) {
        double porcentaje = ((precio - precioDescuento) / precio) * 100;
        return porcentaje;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio sin descuento: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce el precio con descuento: ");
        double precioDescuento = sc.nextDouble();

        double resultado = descuento(precio, precioDescuento);

        System.out.println("El descuento es del " + resultado + "%");
    }
}
