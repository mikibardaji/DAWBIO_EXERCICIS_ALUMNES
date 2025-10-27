/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double largo= 0, ancho= 0, metros_Totales = 0;
        
        int habitaciones = 1;
        boolean habitacion = true;
        String respuesta;

        Scanner sc = new Scanner (System.in);
            do{
                System.out.println("Dime los metros de largo de la habitacion");
                largo = sc.nextDouble();
                sc.nextLine();
                
                System.out.println("Dime los metros de ancho de la habitacion");
                ancho = sc.nextDouble();
                 sc.nextLine();
                double metro_C = (largo * ancho);
                metros_Totales = metros_Totales + metro_C;
                System.out.println("El total de metros cuadrado es: "+metro_C);
                System.out.println("El total de metros cuadrado aucmulado es: "+metros_Totales);
                System.out.println("habitaciones total: "+habitaciones);
                System.out.println("Hay mas habitaciones en tu casa\n S/N");
                respuesta = sc.nextLine();
                
                habitaciones ++;
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.println("Seguimos apuntando");
                    
                }else if ((respuesta.equalsIgnoreCase("n"))) {
                    habitacion = false;
                }
    
                    
                else{
                    System.out.println("Caracter no valido");
                }
                    
            }while(habitacion == true);
            
    }
    
}
