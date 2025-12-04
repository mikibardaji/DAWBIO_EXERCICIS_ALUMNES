package PersonaPackage;

public class persona 
{
    //encapsulameinto básico--> poner atributos privado
    private String dni;//atributo
    private String nombre;
    private String apellido;
    private int edad;

    public persona(String dni, String nombre, String apellido, int edad)//esto es un constructor, porque no tiene void ni int
    {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public final String getDni()
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
        if (nombre == null)
        {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }

    public void setEdad(int edad)
    {
        this.edad=edad;
    }

    public void imprime() 
    {
        System.out.println(nombre + " " + apellido + " con DNI " + dni + " tiene la edad " + edad);
    }

    public boolean esMayor()
    {
        if (edad>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esJubilado() 
    {
        if (edad>=65)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int diferenciaEdad(persona persona1)
    {
        int diferencia;
        diferencia = this.edad - persona1.getEdad();
        //diferencia = this.edad - p.getEdad();
        return diferencia;       
    }
}