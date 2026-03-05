package Objetos;

public class Amic 
{
    private int telefono;
    private String nombre;
    private int edad;

    public Amic (int telefono, String nombre, int edad)
    {
        this.telefono= telefono;
        this.nombre= nombre;
        this.edad=edad;
    }

    public int getTelefono()
    {
        return this.telefono;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setTelefono()
    {
        this.telefono=telefono;
    }

    public void setNombre()
    {
        this.nombre=nombre;
    }

    public void setEdad()
    {
        this.edad=edad;
    }

    @Override
    public String toString()
    {
        return "La persona llamda " + nombre + " de " + edad + " años " + " tiene de numero de telefono " + telefono;
    }
}