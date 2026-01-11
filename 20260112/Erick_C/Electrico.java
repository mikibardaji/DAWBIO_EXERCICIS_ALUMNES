
package models;

public class Electrico extends Pokemon{
    // Attributes
    private int superAtac = 2;
    
    // Constructors
    public Electrico(){
        super();
        this.lifePoint = 40;
    }
    public Electrico(ListaNoms nombre){
        super(nombre);
        this.lifePoint = 40;
    }
    
    @Override
    public int atac(){
        int atacBase = super.atac(); // Se utiliza el metodo atac de la clase padre sin inmutar
        int total = atacBase + this.superAtac; // se modifica la fuerza del ataque como un extra
        this.superAtac++;
        
        System.out.println("Se ha aplicado super ataque, fuerza total: " + total);
        
        return total;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante){
        int danio = atacante.atac();
        
        danio = reduccionDanioPorTipo(atacante, danio);
        recibirDanio(danio);
        mostrarEstado();
        
    }
    private int reduccionDanioPorTipo(Pokemon atacante, int danio){
        if(atacante instanceof Agua) return (int) (danio * 0.75);
        
        return danio;
    }
}
