package Objectes;

public class Botella {
    
    private String Forma;
    private Double Longitud;
    private Double Anchura;
    private int capacitat; 
    private int liquido;
    private boolean tapon;
    private int diametro;
    private String material;


    public Botella()
    {
        capacitat = 25;
        diametro = 3;
        tapon = true;
        material = "Plastic";
        liquido = 0;
    }
    public Botella(int n_capacidad, int diametro)
    {
        capacitat = n_capacidad;
        this.diametro = diametro;
        tapon = true;
        material = "Vidre";

    }



    public void obrirse()
    {
        tapon = false;
    }
    
    public void tancar()
    {
        tapon = true;
    }
    
    public void plenar()
    {
        liquido = capacitat;
    }
    public int verter()
    {
        int vertido;
        if (liquido<=0)
        {
            return 0;
        }
        else if (tapon==true)
        {
            return 0;
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
        return diametro;
    }
    public int getCapacidad()
    {
        return capacitat;
    }
    public int getDiametro()
    {
        return diametro;
    }
    public boolean isTapon()
    {
        return tapon;
    }
    public int getLiquido()
    {
        return liquido;
    }
    public String getMaterial()
    {
        return material;
    }
    public void setCapacidad(int nova_capacitat)
    {
        if (nova_capacitat>0)
        {
        capacitat = nova_capacitat;
        }
        else{
            System.out.println("Capacitat que m'has passat ha de ser positiva -> " + nova_capacitat);
        }

    }

    public void setLiquido(int nuevo_liquido)
    {
        if (nuevo_liquido>0)
        {
            liquido = nuevo_liquido;
        } 
        else {
            System.out.println("No puedo poner esta cantidad de liquido");
        }
    }
}