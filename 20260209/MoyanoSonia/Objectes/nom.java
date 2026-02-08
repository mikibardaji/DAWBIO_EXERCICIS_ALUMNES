package Objectes;

public class nom {

    private String nom;
    private int llargNom;
    private boolean ocupat;

    public nom(){
    this.nom="";
    this.llargNom=0;
    this.ocupat=false;
    }


    public nom(String nomDonat){
    this.nom=nomDonat;
    this.llargNom=nomDonat.length();
    this.ocupat=true;
    }

    public String getNom(){
        return nom;
    }
    public int getLlargNom(){
        return llargNom;
    }
    public boolean isOcupat(){
        return ocupat;
    }

    public void setNom(String nomDonat){
    this.nom=nomDonat;
    this.llargNom=nomDonat.length();
    this.ocupat=true;
    }
    public void setNomBuit(){
    this.nom="";
    this.llargNom=0;
    this.ocupat=false;
    }  
}
