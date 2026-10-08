/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;
import java.util.Scanner;
/**
 *
 * @author gaelg
 */
public class exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double diner1,Libras,dolar;
        System.out.print("Tria una moneda en Euro: L/libra o D/Dolar: ");
        Scanner lector = new Scanner(System.in);
        char diner = lector.next().charAt(0);
        System.out.print("Quina cantitat voldries sapiguer? ");
        diner1 = lector.nextDouble();
        Libra = diner1 * 1.18;
        Dolar = diner1 * 1.13;
        switch (diner) {
            case 'L':
                System.out.println("Tendries " + Libra + " libras");
                break;
            case 'D':
                System.out.println("Tendries " + Dolar + "$");
                break;
        }
        
    }
    
}
