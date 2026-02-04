package Objectes;

public class caja {
    private int premio;
    private boolean abierta;

    public caja(int premio) {
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

