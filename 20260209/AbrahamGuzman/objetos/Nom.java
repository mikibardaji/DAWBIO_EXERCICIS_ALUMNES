/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Nom {
    
    private String nom;
    private int llargNom;
    private boolean ocupat;

    public Nom(){
    this.nom="";
    this.llargNom=0;
    this.ocupat=false;
    }


    public Nom(String nomDonat){
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
    public String toString() {
        if (ocupat) {
               return nom.toUpperCase() + " (" + llargNom + " letras)";
        } else {
            return "[VACIO]";
        }
    }
}