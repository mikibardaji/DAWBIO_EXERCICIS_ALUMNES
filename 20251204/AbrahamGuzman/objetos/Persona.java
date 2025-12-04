/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
    public class Persona {
      private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {

        if (!validarDNI(dni)) {
            System.out.println("ERROR: DNI no válido");
            this.dni = null; // no guardar nada si no es válido
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

    public void mostrarPersona() {
        System.out.println("DNI: " + dni + 
                           " / Nombre: " + nombre +
                           " / Apellidos: " + apellidos +
                           " / Edad: " + edad);
    }

    public boolean mayorEdad() {
        return this.edad >= mayoriaEdad;
    }

    public static boolean validarDNI(String dni) {

        if (dni == null || dni.length() != 9) {
            return false;
        }
          for (int i = 0; i < 8; i++) {
         if (!Character.isDigit(dni.charAt(i))) {
            return false;
        } 
        }
           char letra = dni.charAt(8);
          if (!Character.isLetter(letra)) {
           return false;
    }

        /* 8 números + 1 letra
        String numeros = dni.substring(0, 8);
        char letra = dni.charAt(8);

        return numeros.matches("[0-9]{8}") &&
               Character.isLetter(letra);
*/ 
    return true;
    }
}
    
