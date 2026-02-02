/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allatu;

/**
 *
 * @author mabardaji
 */
public class PruebasArrayCajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja[] baul = new Caja[3];
        baul[0]  = new Caja(10);
        baul[1]  = new Caja(20);
        baul[2]  = new Caja(30);
        
        for (int i = 0; i < baul.length; i++) {
            baul[i] = new Caja(100*i);
        }
        for (int i = 0; i < baul.length; i++) {
            System.out.println(baul[i].getPremio());
        }
    }
    
}
