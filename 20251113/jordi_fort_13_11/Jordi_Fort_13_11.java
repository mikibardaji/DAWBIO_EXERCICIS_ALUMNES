/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jordi_fort_13_11;

import java.util.Random;

/**
 *
 * @author jfo9565
 */
public class Jordi_Fort_13_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numeroCartaAleatoria();
        
    }
    
    public static int numeroCartaAleatoria()
    {
       Random rdm = new Random(); 
       int random = rdm.nextInt(1,11);
       
        switch (random) {
            case 8:
                random = 10;
                break;
                
            case 9:
                random = 11;
                break;
                
            case 10:
                random = 12;
                break;
        }
        return random;
    }
    
    public static int palCartaAleatori()
    {
       Random rdm = new Random(); 
       int random = rdm.nextInt(1,5);
       
       return random;
    }
    
    public static void imprimirCarta(int numCarta, int numPalCarta)
    {
        
        switch (numPalCarta) {
            case 1:
                System.out.println("Carta: " + numCarta + " de OROS");
                break;
                
            case 2:
                System.out.println("Carta: " + numCarta + " de BASTOS");
                break;
                
            case 3:
                System.out.println("Carta: " + numCarta + " de ESPADAS");
                break;
                
            case 4:
                System.out.println("Carta: " + numCarta + " de COPAS");
                break;   
        }
        
    }
    
    public static float puntsCarta(int numCarta)
    {
        float valor = 0f;
        
        if (numCarta < 8) {
            
            valor = numCarta;
        
        }else{
            
            valor = 0.5f;
        }
        
        return valor;
    }
    
    public static boolean bancaDemanaCarta(int puntsJugador, int puntsBanca)
    {
        boolean retorno = false;
        
        if (puntsJugador >= 7.5 && puntsBanca < puntsJugador) {
            
            retorno = true;
        
        }else if (puntsBanca < 5){
            
            retorno = true;
        }
        
        return retorno;
    }
    
    public static boolean guanyaJugador(int puntsJugador, int puntsBanca)
    {
        boolean resultado = false;
        
        if (puntsJugador <= 7.5 && puntsJugador > puntsBanca) {
            
            resultado = true;
            
        }else if(puntsBanca > 7.5){
            
            resultado = true;
        }
        
        return resultado;
    }
}
