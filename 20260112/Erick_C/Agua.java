
package models;

public class Agua extends Pokemon{
    // Attributes
    private int coraza = 3;
    
    // Constructors
    public Agua(){
        super();
        this.lifePoint = 35;
    }
    public Agua(ListaNoms nombre){
        super(nombre);
        this.lifePoint = 35;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante){
        int danio = atacante.atac();
        
        if(coraza == 0){
            danio = reduccionDanioPorTipo(atacante, danio);
            recibirDanio(danio);
            mostrarEstado();
        }
        if (coraza > 0){
            coraza--;
            System.out.println("Coraza absorbe daño. Coraza restante: " + this.coraza);
            mostrarEstado();
        }
        
    }
    private int reduccionDanioPorTipo(Pokemon atacante, int danio){
        if(atacante instanceof Veneno) return (int) (danio * 0.75);
        
        return danio;
    }
}
