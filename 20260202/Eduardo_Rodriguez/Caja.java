package objeto;

public class Caja {

    private int premio;
    private boolean abierta;

    public Caja() {
        premio = "100";
        abierta = false;
    }

    public Caja(int p, boolean a) {
        premio = p;
    }

    public boolean getPremio() {
        return premio;
    }

    public void setPremio(boolean premio) {
        this.premio = premio;
    }

    public void abrir(boolean abierta) {
        abierta = abierta;
    }

    public boolean isAbierta() {
        return premio;
    }
}
