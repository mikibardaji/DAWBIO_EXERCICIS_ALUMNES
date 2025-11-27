package objectes;

public class Ampolla
{
    public int capacidad;
    private int diametro;
    private boolean tapon;
    private int liquido; 
    private String material;
    
    public Ampolla()
    {
        capacidad = 25;
        diametro = 3;
        tapon = true;
        material = "Plástico";
        liquido= 0;
    }
    
    public Ampolla(int n_capacidad, int diametro)
    {
        capacidad = n_capacidad;
        this.diametro = diametro;
        tapon = true;
        material = "Vidrio";
        liquido=0;
    }
    
    public void obrir()
    {
        tapon = false;
    }
    
    public void tancar()
    {
        tapon = true;
    }
    
    public void plenar()
    {
        liquido = capacidad;
    }
    
    public int verter()
    {
        int vertido;
        if (liquido<=0)
        {
            vertido = 0;
        }
        else if (tapon==true)
        {
            vertido = 0;
        }
        else if (liquido< diametro)
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
    
    public int getCapacidad()
    {
        return capacidad;
    }
    
    public int getDiametro()
    {
        return diametro;
    }

    public boolean isTapon() {
        return tapon;
    }

    public int getLiquido() {
        return liquido;
    }

    public String getMaterial() {
        return material;
    }
    
    public void setCapacidad(int nova_capacitat)
    {
        if (nova_capacitat>0)
        {
            capacidad = nova_capacitat;
        }
        else
        {
            System.out.println("La capacidad debe ser positiva!! " + nova_capacitat);
        }    
    }
    
    public void setLiquido(int nuevo_liquido)
    {
        if (nuevo_liquido>0 && nuevo_liquido<= capacidad)
        {
            liquido = nuevo_liquido;
        }
        else
        {
            System.out.println("No puedo poner esta cantidad de liquido" + nuevo_liquido);
        }
    } 
}