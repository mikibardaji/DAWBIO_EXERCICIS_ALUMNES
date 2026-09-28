/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example2primerspalometes;

import java.util.Scanner;

/**
 *
 * @author ama5753
 */
public class Example2PrimersPalometes {

    /**
     *1.	
     * 
1.  Mostrar “Cuanto dinero tienes”
2.	Esperar dineroCartera
3.	Mostrar “Quantes entrades has comprat”
4.	Esperar numEntrades
5.	Mostrar “quant val una entrada?
6.	Esperar preuEntrada
7.	Calcular precioTotalEntradas = precioEntrada x numeroEntradas
8.	Calcular restanteCartera = dineroCArtera – PrecioTotalEntradas
9.	Mostrar “Te quedan”, restanteCartera, “Euros para comprar palomitas”

     */
    public static void main(String[] args) {
        
    //Denifir numeros
        double dinersCartera, preuEntrada, preuTotalEntrades, restantCartera;
        int quantitatEntrades;
    
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Cuanto diners tens");
        dinersCartera = teclat.nextDouble();
        
        System.out.println("Quantes entrades has comprat");
        quantitatEntrades = teclat.nextInt();
        
        System.out.println("Quant val una entrada");
        preuEntrada = teclat.nextDouble();
        
        preuTotalEntrades = preuEntrada * quantitatEntrades;
        restantCartera = dinersCartera - preuTotalEntrades;
                
        System.out.println("Te queden" + restantCartera + "Euros per comprar entrades"  );
        
        
    }
    
}
