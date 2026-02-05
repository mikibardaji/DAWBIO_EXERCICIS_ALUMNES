/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objecte;
/**
 *
 * @author claud
 */
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

    public void abrir() {
        this.abierta = true;
    }
    
}

