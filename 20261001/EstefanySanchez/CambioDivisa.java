/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodivisa;

import java.util.Scanner;


/**
 *
 * @author esa7092
 */
public class CambioDivisa {

    /**
     * 
     * Mostrar Introduce monto de dinero
     * Esperar monto dinero
     * Mostrar Precio divisa a cambiar:
     * Esperar divisa
     * calcular cambio_divisa = monto_dinero * divisa
     * Mostrar Tienes" + cambio_divisa
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos variable
        double monto_dinero;
        double divisa;
        double cambio_divisa;
        Scanner lector = new Scanner(System.in);

        
        // Mostrar introduce monto de dinero
        System.out.println("Introduce monto de dinero: ");
        monto_dinero = lector.nextDouble();
        
        //Mostrar precio de divisa
        System.out.println("Pecio de divisa: ");
        divisa = lector.nextDouble();
        
        
        //Calculamos
        cambio_divisa = monto_dinero * divisa;
        
        //Mostramos
        System.out.println("Tienes: " + cambio_divisa);
    
    
    }
  
}
