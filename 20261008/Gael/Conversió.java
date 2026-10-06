/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversió;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class Conversió {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diner1,Soles,Dolar;
        System.out.print("Escogeix una moneda en Euro: S/Soles o D/Dolar: ");
        Scanner lector = new Scanner(System.in);
        char diner = lector.next().charAt(0);
        System.out.print("Quina cantitat voldries sapiguer? ");
        diner1 = lector.nextDouble();
        Soles = diner1 * 3.87;
        Dolar = diner1 * 1.13;
        
        switch (diner) {
            case 'S':
                System.out.println("Tendries " + Soles + " soles peruanos");
                break;
            case 'D':
                System.out.println("Tendries " + Dolar + "$");
                break;
            default:
                System.out.println("Error");
        }
        
    }
    
}
