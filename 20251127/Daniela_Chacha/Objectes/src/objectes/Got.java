package objectes;

public class Got 
{
    public int capacidad;
    private double diametro;
    private int liquido;
    private String material;  
    
    public Got()
    {
        diametro = 5;
        capacidad = 10;
        material = "Vidrio";
        liquido=0;
    }
    
    public Got(int capacidad)
    {
        diametro = 5;
        this.capacidad = capacidad;
        material = "Corcho";   
        liquido=0;
    }
    public void plenar() 
    {
        liquido = capacidad;
    }

    public int verter() 
    {
        int vertido;
        if (liquido <= 0) 
        {
            vertido = 0;
        } 
        else if (liquido < diametro) 
        {
            vertido = liquido;
            liquido = 0;
        } 
        else 
        {
            liquido -= diametro;
            vertido = diametro;
        }
        return vertido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad>0)
        {
            this.capacidad = capacidad;
        }
        else
        {
            System.out.println("La capacidad debe ser positiva!! -> " + capacidad);
        }
    }

    public void setLiquido(int liquido) {
        if (liquido>0 && liquido<= capacidad)
        {
            this.liquido = liquido;
        }
        else
        {
            System.out.println("No puedo poner esta cantidad de liquido" + liquido);
        }
    }
}