/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2preupalomitas;

import java.util.Scanner;

/**
 *
 * @author ife5182
 */
public class Ex2preupalomitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final double preuEntrada = 9;
        final double preuCrispetes = 6.5;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Quants diners tens a la cartera");
        //mostrar frase
        
        double dinersCartera = lector.nextDouble();
        // variable igual a lo que escriba
        
        System.out.println("Quantes entrades has comprat");
        //mostrar frase
        
        double entradesComprades = lector.nextDouble();
        //variable igual a lo que escriba
        
        double totalEntrades = entradesComprades*preuEntrada;
        // calcular lo que valen x entradas
        
       
        
        double dinersRestants = dinersCartera-totalEntrades;
        //restar el dinero total - lo que valen las entradas
        
        System.out.println("Et queden" + dinersRestants);
        //mostrar el dinero que te queda
        

        
        
        if (dinersRestants >= preuCrispetes){
        System.out.println("Pots comprar crispetes");
        }
        else {
        System.out.println("No Pots comprar crispetes");
        }
                
        // si el dinero restante es mas grande o igual de lo que valen las palomitas mostrar que puedes comprarlas, sino, mostrar lo contrario
        
    }
    
}
