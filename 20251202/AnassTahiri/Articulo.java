package a3.ud8;
public class Articulo {

    

public static final double IVA_GENERAL = 0.21;
public static final double IVA_REDUCIDO = 0.10;
public static final double IVA_SUPER_REDUCIDO = 0.04;


private String nombre;
private double precio;
private double iva;
private int cuantosQuedan;


public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {

if (nombre == null || nombre.isEmpty() ||
precio <= 0 ||
(iva != IVA_GENERAL && iva != IVA_REDUCIDO && iva != IVA_SUPER_REDUCIDO) ||
cuantosQuedan < 0) {

System.err.println("ERROR al crear Articulo");
return;
}

this.nombre = nombre;
this.precio = precio;
this.iva = iva;
this.cuantosQuedan = cuantosQuedan;
}


public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
if (!nombre.isEmpty()) {
this.nombre = nombre;
}
}

public double getPrecio() {
return precio;
}

public void setPrecio(double precio) {
if (precio > 0) {
this.precio = precio;
}
}

public double getIva() {
return iva;
}

public void setIva(double iva) {
if (iva == IVA_GENERAL || iva == IVA_REDUCIDO || iva == IVA_SUPER_REDUCIDO) {
this.iva = iva;
}
}

public int getCuantosQuedan() {
return cuantosQuedan;
}

public void setCuantosQuedan(int cuantosQuedan) {
if (cuantosQuedan >= 0) {
this.cuantosQuedan = cuantosQuedan;
}
}


public double getPVP() {
return precio * (1 + iva);
}

public double getPVPDescuento(double descuento) {
return getPVP() * (1 - descuento);
}

public boolean vender(int x) {
if (x > 0 && x <= cuantosQuedan) {
cuantosQuedan -= x;
return true;
}
return false;
}

public boolean almacenar(int x) {
if (x > 0) {
cuantosQuedan += x;
return true;
}
return false;
}

public void imprime() {
System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + (iva * 100) + "% - PVP: " + getPVP() + "€ - Stock: " + cuantosQuedan);
}
}