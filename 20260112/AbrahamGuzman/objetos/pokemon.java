/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public abstract class pokemon {
    protected final nombres nom;
    protected int LP;
    protected boolean vivo;

    public pokemon(nombres n) {
        this.nom = n;
        this.LP = 100;
    }

    public nombres getNom() {
        return nom;
    }

    public int getLP() {
        return LP;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setLP(int LP) {
        this.LP = LP;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

   
    @Override
    public boolean equals(Object obj) {
       if(this == obj) return true; 
        if(!(obj instanceof pokemon)) return false; 
        pokemon poke = (pokemon) obj; 
        
        return this.nom == poke.nom;
    }
    
    
}
