import java.util.Random;
import java.util.Scanner;
import objetos.*;

public class juego {
    public static void main(String[] args) {
      Random rd = new Random();
      int numRand = 0;


      Scanner sc = new Scanner(System.in);
      System.out.println("Cual es tu nombre?");
      String nomb = sc.nextLine();
      System.out.println("que dificultad quieres jugar? 1) facil 2) dificil ");
      int dific = sc.nextInt();
      jugador j = new jugador(nomb);  
      moneda m = new moneda();  
      obstaculo o = new obstaculo();  
      System.out.println("tu energia inical es " + j.getEnergia());

      System.out.println("Nombre: "+j.getNombre()); 
      if (dific == 2){
        System.out.println("Dificultad Dificil");
        System.out.println("no se hace nada");
        // j.setDistanciaAcomulada(j.getDistanciaAcomulada() + j.correr(j.getPowerUp()));
        // j.setDistanciaAcomulada(j.getDistanciaAcomulada() + j.correr(j.getPowerUp()));
        // System.out.println(j.getDistanciaAcomulada());

          numRand = 2;
          if (numRand == 1){
            j.setEnergia(j.getEnergia() + o.obstaculoMaximo("barrera"));
          } else if(numRand == 2) {
            j.setEnergia(j.getEnergia() + o.obstaculoMaximo("tren"));
          }

      } else {
        System.out.println("dificultad Facil");
        do { 
          j.setDistanciaAcomulada(j.getDistanciaAcomulada() + j.correr(j.getPowerUp()));
          System.out.println("llevas " + j.getDistanciaAcomulada() + " pasos ");
          System.out.println("");
          
          numRand = rd.nextInt(1,3);
          if (numRand == 1){
            j.setEnergia(j.getEnergia() + o.obstaculoMaximo("barrera"));
            System.out.println("Te chocaste con una barrera");
          } else if(numRand == 2) {
            j.setEnergia(j.getEnergia() + o.obstaculoMaximo("tren"));
            System.out.println("Te chocaste con un tren");
          }
          System.out.println("tu energia es de " + j.getEnergia());
          System.out.println("");

          j.setPuntuacion(j.getPuntuacion() + j.recogerMoneda(m.getValor()));
          System.out.println("agarraste una moneda tu puntuacion es de: " + j.getPuntuacion());
          j.setPowerUp(m.hasPowerUp());
          System.out.println("");

          System.out.println("tienes powerUp activado? " + j.getPowerUp());

          System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        } while (j.getEnergia() >= 0);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(j.getNombre() +  "!! la partida termino los resultados de tu juego han sido estos:");
        System.out.println("******** Puntos: " + j.getPuntuacion() + " ********");
        System.out.println("******** Distancia en pasos: " + j.getDistanciaAcomulada() + " ********");
      }


      





      sc.close();
    }

}
