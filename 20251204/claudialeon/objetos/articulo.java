package objetos;

public class articulo {
    private String nom;
    private int preuSiniva;
    private int preuiva;
    private int quantsQuedan;

    public static final int IVA_GENERAL = 21;
    public static final int IVA_REDUCIDO = 10;
    public static final int IVA_SUPERREDUCIDO = 4;
    

    public articulo(String nom, int preuSiniva, int preuiva, int quantsQuedan) {
        this.nom = nom;
        this.preuSiniva = preuSiniva;
        this.preuiva = preuiva;
        this.quantsQuedan = quantsQuedan;
}
    
     public void mostrarArticulo() {
        System.out.println("Nom: " + nom + " / Preu sense IVA: " + preuSiniva + " euros / IVA: " + preuiva + " % / Unitats: " + quantsQuedan);
    }
    public double getPVP() {
        return preuSiniva * (1.0 + preuiva / 100.0);
    }

   
    public double getPVPDescuento(double descuentoPercent) {
        double pvp = getPVP();
        return pvp * (1.0 - descuentoPercent / 100.0);
    }


    public boolean vender(int x) {
        if (x <= 0) return false;
        if (x <= quantsQuedan) {
            quantsQuedan -= x;
            return true;
        } else {
            return false;
        }
    }

 
    public boolean almacenar(int x) {
        if (x <= 0) return false;
        quantsQuedan += x;
        return true;
    }

    public String getNom() {
        return nom;
    }

    public int getPreuSiniva() {
        return preuSiniva;
    }

    public int getIva() {
        return preuiva; 
    }

    public int getQuantsQuedan() {
        return quantsQuedan;
    }
}

