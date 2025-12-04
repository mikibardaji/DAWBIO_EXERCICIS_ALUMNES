package Articulo;

public class Articulo 
{
    private String nombre;
    private double precio;
    private final double iva=0.21;    
    private int restante;

    public Articulo(String nombre, double precio, int restante) 
    {
        boolean error = false;

        if (nombre == null) 
        {
            System.out.println("El nombre no puede estar vacío.");
            error = true;
        } 

        else 
        {
            this.nombre = nombre;
        }

        if (precio < 0) 
        {
            System.out.println("El precio no puede ser negativo.");
            error = true;
        } 

        else 
        {
            this.precio = precio;
        }

        if (restante <0) 
        {
            System.out.println("La cantidad en almacén no puede ser negativa.");
            error = true;
        } 
        else 
        {
            this.restante = restante;
        }

        if (!error) 
        {
            System.out.println("Artículo creado correctamente: " + this.nombre);
        }
    }

    public String getNombre() 
    {             
        return nombre; 
    }

    public double getPrecio() 
    { 
        return precio; 
    }

    public double getIva() 
    { 
        return iva; 
    }
        
    public int getRestante() 
    { 
        return restante; 
    }

    public void setNombre(String nombre) 
    {
        if (nombre!=null) 
        {
            this.nombre = nombre;
        } 
        else 
        {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public void setPrecio(double precio) 
    {
        if (precio>= 0) 
        {
            this.precio = precio;
        } 
        else 
        {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setRestante(int restante) 
    {
        if (restante >= 0) 
        {
            this.restante = restante;
        } 
        else 
        {
            System.out.println("La cantidad en almacén no puede ser negativa.");
        }
     }
}