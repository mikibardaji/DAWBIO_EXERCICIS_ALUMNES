/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precio_eur
import java.util.Scanner;
/**
 *
 * @author diego90895
 */
public class precio_eur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double DinersEnBanc,Preu,Calcul,Cambiar_a_mes;
        Scanner lector = new Scanner(System.in);
        System.out.print("Cuants costa: ");
        Preu = lector.nextDouble();
        System.out.print("Quants diners tens al banc: ");
        DinersEnBanc = lector.nextDouble();
        Calcul = DinersEnBanc - Preu;
        System.out.println(Calcul);
        Cambiar_a_mes = Calcul * -1;
        if (DinersEnBanc < Preu){
            
            System.out.println("Et falten " + Cambiar_a_mes + "�");
        }else{
            if (DinersEnBanc > Preu){
                System.out.println("Tens suficients diners" + Calcul);
            }
        }
        
    }
    
}
