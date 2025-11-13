import java.util.Random;
import java.util.Scanner;

public class ruleta {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    }
    public static int CantidadApostar(Scanner sc){
        int apuesta;       
        do{
         System.out.println("Cuanto dinero quiere apostar");
         apuesta = sc.nextInt();
        }while(apuesta < 0);
        
        return apuesta;
    }
    public static int AgregarPuntos(Scanner sc , int saldo){
        int puntos;
        do{
       
        System.out.println("Cuantos puntos quiere añadir");
        puntos = sc.nextInt();
        }while(puntos < 0);
        saldo +=puntos;
       return saldo;
    } 
    public static void pintaAsterisc (int numero){
        for (int i = 0; i <= numero; i++) {
            System.out.print("*");
        }
    }
    public static int bola(){
    Random rd = new Random();
        int bola = rd.nextInt(0, 37);
        return bola;
    }
    public static int apostaPunts(Scanner sc){
        System.out.println("Esculli el tipus d'aposta:");
        System.out.println("1. -2 per a par");
        System.out.println("2. -1 per a impar");
        System.out.println("3. cualquier otro para apostar hasta el 36");
        int eleccio = sc.nextInt();
        
      while(eleccio>36 || eleccio<-2){
        System.out.println("Has de triar una opció d'aposta vàlida");    
        eleccio = sc.nextInt();
        }

        return eleccio; 
        
    }
   public static int validarApuesta (int puntsTotal, int puntsAposta){
     if (puntsAposta>puntsTotal){
            return -1;
        }
        else { 
         return puntsAposta;
     }
    }
    public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta, int bola){
      if((tipusAposta == -2 && bola%2==0) || (tipusAposta == -1 && bola%2!=0)){
         saldo += puntsAposta * 2;
      } else if (tipusAposta == bola){
           saldo += puntsAposta * 36;
      } else {
         saldo -=puntsAposta;
      }
      return saldo;
    }
}