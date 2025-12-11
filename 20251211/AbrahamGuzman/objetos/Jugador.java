/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Jugador {
    private String nom;
    private int puntacion;
    private int distanciaAcumulada;
    private int energia;
    private boolean powerUp;
    
    public int correr(){
      int metros = 2;
      if(powerUp){
       metros *=3;
      }
      return metros;
    }
    public boolean recollirMoneda(Moneda coin){
    
    }
}
