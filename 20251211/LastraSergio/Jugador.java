package Classes_principals;

public class Jugador {

    //Atributs
    private String nom;
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;

    // Constructor
    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = 50;
        this.power_up = false;
    }

    //Mètodes
    public void correr(){
        int distancia = 2;
        if (power_up) {
            distancia *= 3;
        }
        distancia_acumulada += distancia;
    }

    public void recollirMoneda(Moneda coin){

    }
    
    //Setters i Getters
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    public void setPuntuacio(int puntuacio){
        this.puntuacio = puntuacio;
    }

    public int getPuntuacio(){
        return puntuacio;
    }

    public void setDistancia_acumulada(int distancia_acumulada){
        this.distancia_acumulada = distancia_acumulada;
    }

    public int getDistancia_acumulada(){
        return distancia_acumulada;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getEnergia(){
        return energia;
    }

    public void setPower_up(boolean power_up){
        this.power_up = power_up;
    }

    public boolean getPowe_up(){
        return power_up;
    }

}
