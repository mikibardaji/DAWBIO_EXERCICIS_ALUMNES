/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cond3i4;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Cond13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double horesTreball, horesExtra, pagaBruta, pagaNeta, paga25, paga45;
        final double PAGA_HORA = 15;
        final double HORES_NORMALS = 130;
        final double TARIFA_PAGA_EXTRA = 1.5;
        System.out.print("Digues les hores treballades: ");
        horesTreball = lector.nextDouble();
        horesExtra = horesTreball - HORES_NORMALS;
        pagaBruta = ((horesTreball + horesExtra*TARIFA_PAGA_EXTRA) * PAGA_HORA);
        if (pagaBruta>500) {
            paga25 = pagaBruta - 500;
            if (pagaBruta>900) {
                paga25 = 400;
                paga45 = pagaBruta - 900;
            } else { 
                paga45 = 0;
            }    
        } else {
            paga25 = 0;
            paga45 = 0;
        }

        pagaNeta = (pagaBruta-paga25-paga45) + paga25*0.75 + paga45*0.55;
        
        System.out.println("El teu sou brut es: " +pagaBruta+" euros." );
        System.out.println("El teu sou sou es: " +pagaNeta+" euros." );
        System.out.println("T'han cobrat de taxes " + (paga25*0.25+paga45*0.45)+" euros." );

        // TODO code application logic here
    }
    
}
