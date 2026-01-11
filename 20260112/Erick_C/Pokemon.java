
package models;

import combat.AccionesCombate;
import java.util.Random;

public abstract class Pokemon implements AccionesCombate{
    // Attributes 
    // public private protected
    private final ListaNoms nombre;
    protected int lifePoint; 
    protected boolean vivo;
    
    // Constructor
    public Pokemon (){
        this.nombre = ListaNoms.Pikachu;
        this.vivo = true;
    }
    public Pokemon(ListaNoms nombre){
        this.nombre = nombre; // -> variable de tipo Enum
        this.vivo = true;
    }
    
    // Getters and Setters
    public ListaNoms getNombre() {
        return nombre;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    // Methods
    public void mostrarDatosGenerales(){
        System.out.println(this.nombre + " - LP: " + this.lifePoint);
    }
    
    @Override
    public int atac(){
        Random rand = new Random();
        
        int fuerza = rand.nextInt(10);
        
        System.out.println(this.nombre + " ataca con fuerza " +  fuerza);
        
        return fuerza;
    }
    
    public void recibirDanio(int danio){
        this.lifePoint -= danio;
        if(this.lifePoint <= 0){
            this.vivo = false;
            this.lifePoint = 0;
        }
        
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; // comprobar que sean el mismo objeto
        if(!(obj instanceof Pokemon)) return false; // Comprobar que sean un Pokemon
        Pokemon poke = (Pokemon) obj; // Convertir el Objct en Pokemon
        
        return this.nombre == poke.nombre; // Comparar el nombre de los pokemones
    }
    public void mostrarEstado(){
        String estado = "";
        if(this.lifePoint > 0) estado = "vivo";
        else estado = "muerto";
        
        int lp = Math.max(lifePoint, 0);
        
        System.out.print(nombre + " " +  lp + " LP " + estado +  " ");
        
        for(int i = 0; i < lp; i++){
            System.out.print("=");
        }
        
        System.out.println("\n");
    }
    
}
