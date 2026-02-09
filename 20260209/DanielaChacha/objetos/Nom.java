package objetos;

public class Nom 
{
    private String nom;
    private int numLetrasNom;
    private boolean ocupat;

    public Nom()
    {
        this.nom="";
        this.numLetrasNom=0;
        this.ocupat=false;
    }

    public Nom(String nomIntroducido)
    {
        this.nom=nomIntroducido;
        this.numLetrasNom=nomIntroducido.length();
        this.ocupat=true;
    }

    public String getNom()
    {
        return nom;
    }
    public int getLlargNom()
    {
        return numLetrasNom;
    }
    public boolean isOcupat()
    {
        return ocupat;
    }

    public void setNom(String nomIntroducido)
    {
        this.nom=nomIntroducido;
        this.numLetrasNom=nomIntroducido.length();
        this.ocupat=true;
    }
    public void setNomVacio()
    {
        this.nom="";
        this.numLetrasNom=0;
        this.ocupat=false;
    }  
}