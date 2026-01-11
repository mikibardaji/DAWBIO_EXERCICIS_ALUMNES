abstract class Pokemon implements AccionesCombate{
 // Atributos
    private final LlistaNoms nom; // final para que no cambie
    protected int lifePoints;
    protected boolean viu;
    
    // Constructor
    protected Pokemon(LlistaNoms nom, int lifePointsInicials) {
        this.nom = nom;
        this.lifePoints = lifePointsInicials;
        this.viu = true;
    }
    
    // Getters para consultar atributos individuales
    public LlistaNoms getNom() {
        return nom;
    }
    
    public int getLifePoints() {
        return lifePoints;
    }
    
    public boolean isViu() {
        return viu;
    }
    
    // Método para mostrar datos generales (toString)
    @Override
    public String toString() {
        return nom + " " + lifePoints + " LP";
    }
    
    // Dos Pokémon son iguales si tienen el mismo nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Pokemon)) return false;
        Pokemon other = (Pokemon) obj;
        return this.nom == other.nom;
    }
    
    // Implementación común del método atac
    @Override
    public int atac() {
        int forca = (int)(Math.random() * 11); // 0 a 10
        System.out.println(nom + " ataca con fuerza " + forca);
        return forca;
    }
    
    // Método protegido para mostrar estado (no puede ser llamado desde Main)
    protected void mostrarEstadoPokemon() {
        String estat = viu ? "viu" : "mort";
        String barraVida = "=".repeat(Math.max(0, lifePoints));
        System.out.println(nom + " " + lifePoints + " LP " + estat + " " + barraVida);
    }
    
    // Método abstracto para obtener el tipo (cada subclase lo implementa)
    public abstract String getTipus();
}
