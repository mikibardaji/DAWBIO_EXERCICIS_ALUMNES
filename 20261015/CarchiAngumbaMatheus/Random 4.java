/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random4.pkg5.pkg6;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Random456 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        final int X;
        X = 6;
        int dau = aleatori.nextInt(1,X+1);
        System.out.println("Llançare un dau de "+X+" cares");
        if (dau==X) {
            System.out.println("Has tret un "+dau+", quina sort.");
        } else if (dau==1) {
            System.out.println("Has tret un "+dau+", quina llastima." );
        } else {
            System.out.println("Has tret un "+dau+".");
        }
        
    }
    
}
