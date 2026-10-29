/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablas;

/**
 *
 * @author jncr5
 */
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 9; tabla++){
            System.out.println("Tabla del " +tabla);
            for (int num = 1; num <= 10; num++){
                System.out.println(tabla+ " x " + num + " = " +(tabla*num));
            }
            
        }
    }
    
}
