/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasemana;

import java.util.Scanner;

/**
 *
 * @author esa7092
 */
public class DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner le = new Scanner(System.in);
        System.out.println("Entra dia de la semana:");
        
        int dia = le.nextInt();
        
        switch (dia){
            case 1: 
                System.out.println("Lunes");
                break;//despues de cada case usar break 
            case 2: 
                System.out.println("martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5: 
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
          
            default:
                System.out.println("numero no valido");
        }
    
    
    
    }
    
}
