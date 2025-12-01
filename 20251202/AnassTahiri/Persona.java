package a3.ud8;
public class Persona {


private final String dni;
private String nombre;
private String apellidos;
private int edad;


public static final int MAYORIA_EDAD = 18;


public Persona(String dni, String nombre, String apellidos, int edad) {

if (!validarDNI(dni)) {
System.err.println("ERROR: DNI no válido");
this.dni = "INVALIDO";
return;
}

this.dni = dni;
this.nombre = nombre;
this.apellidos = apellidos;
this.edad = edad;
}


public String getDni() {
return dni;
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getApellidos() {
return apellidos;
}

public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}

public void imprime() {
System.out.println("DNI: " + dni +
" Nombre: " + nombre +
" Apellidos: " + apellidos +
" Edad: " + edad);
}

public boolean esMayorEdad() {
return edad >= MAYORIA_EDAD;
}

public boolean esJubilado() {
return edad >= 65;
}

public int diferenciaEdad(Persona p) {
return Math.abs(this.edad - p.edad);
}


public static boolean validarDNI(String dni) {
return dni.matches("\\d{8}[A-Za-z]");
}
}