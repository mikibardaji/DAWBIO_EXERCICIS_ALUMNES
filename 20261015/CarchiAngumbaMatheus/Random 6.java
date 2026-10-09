/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random.pkg6;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Random6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random aleatori = new Random();
        String tiradaUsuari,tiradaOrdinador;
        tiradaUsuari = "";
        tiradaOrdinador = "";
        System.out.println("Jugarem al Pedra (0), Paper (1) o Tisores (2)");
        System.out.println("Escriu un dels numeros, fes la teva seleccio: ");
        int eleccioUsuari = lector.nextInt();
        int eleccioOrdinador = aleatori.nextInt(0,3);
        boolean guanyaOrdinador = true;
        switch(eleccioUsuari) {
            case 0:
                tiradaUsuari="Pedra";
                break;
            case 1:
                tiradaUsuari="Paper";
                break;
            case 2:
                tiradaUsuari="Tisores";
                break;
            default:
                System.out.println("Escull una de les opcions si us plau (0,1,2)");      
        }
        switch(eleccioOrdinador) {
            case 0:
                tiradaOrdinador="Pedra";
                break;
            case 1:
                tiradaOrdinador="Paper";
                break;
            case 2:
                tiradaOrdinador="Tisores";
                break;    
        }
        
        if (eleccioUsuari >= 0 && eleccioUsuari <=2) {
        System.out.println("La teva seleccio ha estat: " + tiradaUsuari + "("+eleccioUsuari +")");
        System.out.println("La meva seleccio ha estat: " + tiradaOrdinador + "("+eleccioOrdinador +")");
            if (eleccioUsuari!=eleccioOrdinador) {
                if ((eleccioUsuari==0 && eleccioOrdinador==1) || (eleccioUsuari==1 && eleccioOrdinador==2) || (eleccioUsuari==2 && eleccioOrdinador==0) ) {
                    guanyaOrdinador = true;
                } else {
                    guanyaOrdinador = false;
                }
                if (guanyaOrdinador) {
                    System.out.println("He guanyat yo");
                } else {
                    System.out.println("Has guanyat tu");
                }
            } else {
                System.out.println("Hem quedat en empat");           
            }
        }
    }
    
}
