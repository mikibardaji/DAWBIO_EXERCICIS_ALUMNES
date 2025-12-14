/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subwaysurf;
/**
 *
 * @author claud
 */
public class Obstacle {
    private String tipus;
    private int dificultat;

    public Obstacle(String tipus) {
        this.tipus = tipus;
        if (tipus == "Barrera") {
            this.dificultat = (int)(Math.random() * 5) + 1;
        } else {
            this.dificultat = (int)(Math.random() * 6) + 5;
        }
    }

    public String getTipus() {
        return tipus;
    }

    public int getDificultat() {
        return dificultat;
    }

    public static Obstacle obstacleMaxim() {
        Obstacle o = new Obstacle("Tren");
        o.dificultat = 10;
        return o;
    }
}
