package objectos;


public class persona {
    private int dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public persona(int dni, String nombre, String apellidos, int edad) {
        this.dni=dni;
        this.apellidos=apellidos;
        this.edad=edad;
        this.nombre=nombre;

    }
     
    public boolean esMayor() {
        return edad >= 18;
    }

    public void resultado() {
        System.out.println("Nombre y apellidos" + nombre + " " + apellidos);
        System.out.println("Il dni es" + dni);
        System.out.println("Edad: " + edad);
    }


}

