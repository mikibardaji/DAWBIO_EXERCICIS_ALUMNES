package allatu;

public class Caja {
    private int premio;
    private boolean abierta;

    public Caja(int premio) {
        this.premio = premio;
        abierta = false;
    }

    public int getPremio() {
        return premio;
    }
    public boolean isAbierta() {     
        return abierta; 
    }
    public void setAbierta(boolean abierta) { 
        this.abierta = abierta; 
    }
    
    
}