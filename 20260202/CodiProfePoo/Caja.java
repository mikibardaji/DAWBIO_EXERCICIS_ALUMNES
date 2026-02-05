/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatu;

/**
 *
 * @author bardaji
 */

/**
 *
 * @author mabardaji
 */
public class Caja {
    private int premio;
    private boolean abierta;
    private boolean elegida; //no la utilitzo gaire però es un atribut interessant

    public Caja(int premio) {
        this.premio = premio;
        this.abierta = false;
        this.elegida = false;
    }

    public int getPremio() {
        return premio;
    }
    
    public void setPremio(int premio) {
        this.premio = premio;
    }
    
    public boolean isAbierta() {
        return abierta;
    }
    
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public boolean isElegida() {
        return elegida;
    }
    
    public void setElegida(boolean elegida) {
        this.elegida = elegida;
    }

    
}

