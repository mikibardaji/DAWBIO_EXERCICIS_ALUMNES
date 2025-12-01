package PersonaPackage;

public class persona 
{
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public persona(String dni, String nombre, String apellido, int edad)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getDni()
    {
        return dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setDni(String dni)
    {
        this.dni=dni;
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }

    public void setEdad(int edad)
    {
        this.edad=edad;
    }

    public void mostrarPersona() 
    {
        System.out.println(nombre + " " + apellido + " con DNI " + dni);
    }

    public boolean esMajor()
    {
        if (edad>=18)
        {
            System.out.println("Es mayor de edad");
            return true;
        }
        else
        {
            System.out.println("No es mayor de edad");
            return false;
        }
    }
}