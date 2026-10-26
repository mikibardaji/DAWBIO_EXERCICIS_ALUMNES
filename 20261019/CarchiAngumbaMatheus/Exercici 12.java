/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;


/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cels=1;
        for(int hora=0; hora<=10;hora++){
            System.out.println("Hora "+hora+" --> "+cels+ " cèl·lules" );
            System.out.println("");
            cels *= 2;
        }

    }

}
