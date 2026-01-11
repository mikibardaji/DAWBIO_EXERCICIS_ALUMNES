package models;

public class Veneno extends Pokemon {

    // Attributes
    private boolean defensaActiva = false;

    // Constructors
    public Veneno() {
        super();
        this.lifePoint = 50;
    }

    public Veneno(ListaNoms nombre) {
        super(nombre);
        this.lifePoint = 50;
    }
    
    @Override
    public void recibirImpacto(Pokemon atacante) {
        int danio = atacante.atac();
        
        if(this.lifePoint < 15) this.defensaActiva = true;
        
        if(this.defensaActiva) danio /= 2;
        
        danio = reduccionDanioPorTipo(atacante, danio);
        recibirDanio(danio);
         mostrarEstado();

    }

    private int reduccionDanioPorTipo(Pokemon atacante, int danio) {
        if (atacante instanceof Electrico) {
            return (int) (danio * 0.75);
        }

        return danio;
    }
}
