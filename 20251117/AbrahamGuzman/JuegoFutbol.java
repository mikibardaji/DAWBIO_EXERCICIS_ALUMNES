/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegofutbol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xabiel
 */
public class JuegoFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ladoUsuario ="", ladoMaquina ="";
        int golUsuario=0, golMaquina=0; 
        int TandaPenalti=0;
        System.out.println("Y COMIENZA LOS PENALES!!!!!");
        System.out.println("Pateas primero");
        boolean seguir =false;
        do{
        ladoUsuario = elegirLado(sc);
        ladoMaquina = eligirLadoMaquina();
        
            
            System.out.println("Aqui vas a patear");
            boolean usuario = hayGol(ladoUsuario, ladoMaquina);
            if(usuario == true){
                System.out.println("VAMOOOOOS");
                golUsuario ++;
            } else {
                System.out.println("F");
            }
            System.out.println("Aca va la maquina");
            ladoMaquina = eligirLadoMaquina();
            System.out.println("Elige a donde te quieres tirar");
            ladoUsuario = elegirLado(sc);
            boolean maquina = hayGol(ladoMaquina, ladoUsuario);
              if(maquina == true){
                System.out.println("Gol de la maquina.");
                golMaquina ++;
            } else {
                System.out.println("HABEMUS PORTEROOO");
            }
            TandaPenalti++;
            System.out.println("En el "+TandaPenalti+" penalti");
            marcador(golUsuario, golMaquina);
            
            seguir=tandaPenaltis(golUsuario, golMaquina, TandaPenalti);
            
            
        }while(seguir);
        
        System.out.println("Se acabo el resultado es ");
        marcador(golUsuario, golMaquina);
        
        
        
    }
    public static String elegirLado(Scanner sc){
        System.out.println("A que vas Left/Right/Center");
        String lado = sc.nextLine().toLowerCase();
        
        while( !lado.equals("left") && !lado.equals("center") && !lado.equals("right")){
            System.out.println("Opcion invalida, coloque una opcion valida");
            lado = sc.nextLine().toLowerCase();
        }
            return lado; 
    }
    public static String eligirLadoMaquina(){
      Random rd = new Random();
      int azar = rd.nextInt(0, 3);
      String lado=" ";
        switch (azar) {
            case 0:
             lado = "left";    
                break;
             case 1:
             lado = "right";    
                break;
             case 2:
             lado = "center";    
                break;
           
        }
        return lado;
    }
    public static boolean hayGol(String pateador, String portero){
      boolean gol;
        if(pateador.equals(portero)){
           System.out.println("PARADOOOON");
           gol = false;
       }else{
           System.out.println("GOOOOOOOOOOOOL");
           gol= true;
       }
        return gol;
    }
    public static void marcador (int golUsuario, int golMaquina){
         for (int i = 0; i < 10; i++) {
             System.out.print("*");
             
        } System.out.println();
         System.out.println("*   Usuario "+golUsuario+ "   *");
         System.out.println("*   Maquina "+golMaquina+ "   *");
          for (int i = 0; i < 10; i++) {
             System.out.print("*");
    }
    }
    public static boolean tandaPenaltis(int golUsuario, int golMaquina, int NumeroTanda){
       boolean seguir;
       int diferencia = golUsuario - golMaquina;
       if(diferencia < 0){
          diferencia *= -1;
       }
        if(NumeroTanda < 3){
         seguir = true; 
        } else{
            switch (NumeroTanda) {
                case 3:
                    if(diferencia == 3){
                     seguir = false;
                     } else {
                      seguir = true; 
                      }
                      break;
                     case 4:
                      if(diferencia == 2){
                       seguir = false;
                        } else {
                        seguir = true; 
                        }
                    break;
                      default:
                      if(diferencia == 1){
                      seguir = false;
                     } else {
                        seguir = true; 
                        }
                    ;
             }
        } return seguir;
    }
}
 