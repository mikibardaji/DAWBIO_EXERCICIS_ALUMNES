/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subwaysurf;

/**
 *
 * @author claud
 */
public class Jugador {
    private String nom;
    private int puntuacio;
    private int distancia_acumulada;
    private int energia;
    private boolean power_up;

    public Jugador(String nom) {
        this.nom = nom;
        this.puntuacio = 0;
        this.distancia_acumulada = 0;
        this.energia = 50;
        this.power_up = false;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean isPower_up() {
        return power_up;
    }

    public void setPower_up(boolean power_up) {
        this.power_up = power_up;
    }

    public void correr() {
        if (power_up) {
            distancia_acumulada += 6;
            System.out.println(distancia_acumulada + " metres.");
        } else {
            distancia_acumulada += 2;
            System.out.println(distancia_acumulada + " metres.");
        }
    }

    public void recollirMoneda(Moneda m) {
        puntuacio += m.getValor();
        if (m.PowerUp()) {
            power_up = true;
        } else {
            power_up = false;
        }
        System.out.println("Moneda recogida: " + m.getValor());
    }

    public void xocar(Obstacle o) {
        energia -= o.getDificultat();
        power_up = false;
        System.out.println("Has chocat amb " + o.getTipus() + ". La teva energia actual es: " + energia);
    }
}
    

