package objetos;

public class jugador {
    private String nombre;
    private int puntuacion;
    private int distanciaAcomulada;
    private int energia;
    private boolean powerUp;
    

    //Constructor
    public jugador(String nombre){

        this.nombre = nombre;
        energia = 50;
        // puntuacion = this.puntuacion;
        // distanciaAcomulada = this.distanciaAcomulada;
        // powerUp = this.powerUp;

    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public int getDistanciaAcomulada () {
        return distanciaAcomulada;
    }

        public int getEnergia () {
        return energia;
    }

        public boolean getPowerUp () {
        return powerUp;
    }
    //Setters
    public void setDistanciaAcomulada(int distanciaAcomulada){
        this.distanciaAcomulada = distanciaAcomulada;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

        public void setEnergia(int energia) {
        this.energia = energia;
    }

        public void setPowerUp(boolean powerUp) {
        this.powerUp = powerUp;
    }


    public int correr(boolean powerUp){
        int distanciaAvanzada=0;
        if (powerUp == false) {
            distanciaAvanzada = 2;
        } else if (powerUp == true) {
            distanciaAvanzada = 6;
        }
        return distanciaAvanzada;
    }

    public int recogerMoneda(int moneda){
        return moneda;
    }




    
}
