/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Articulo {
    
    private String nombre;
    private double precioBase;
    private double iva;

    // TIPOS DE IVA FIJOS
    public static final double IVA_GENERAL = 0.21;
    public static final double IVA_REDUCIDO = 0.10;
    public static final double IVA_SUPER_REDUCIDO = 0.04;

    public Articulo(String nombre, double precioBase, double iva) {
        this.nombre = nombre;

        if (precioBase < 0) {
            System.out.println("ERROR: El precio no puede ser negativo.");
            return;
        }
        this.precioBase = precioBase;

        if (iva == IVA_GENERAL || iva == IVA_REDUCIDO || iva == IVA_SUPER_REDUCIDO) {
            this.iva = iva;
        } else {
            System.out.println("ERROR: Tipo de IVA no válido.");
            return;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getIVA() {
        return iva;
    }

    public void setIVA(double iva) {
        if (iva == IVA_GENERAL || iva == IVA_REDUCIDO || iva == IVA_SUPER_REDUCIDO) {
            this.iva = iva;
        } else {
            System.out.println("ERROR: Tipo de IVA no válido.");
        }
    }

    public double calcularPrecioFinal() {
        return precioBase + precioBase * iva;
    }

    public void mostrarArticulo() {
        System.out.println(nombre + "Precio base: " + precioBase + 
                           " IVA aplicado: " + iva +
                           " Precio final: " + calcularPrecioFinal());
    }
}
