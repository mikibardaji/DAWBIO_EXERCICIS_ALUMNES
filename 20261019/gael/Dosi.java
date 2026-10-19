/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosi;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Dosi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int dosis,falta,hora;
        
        System.out.print("Cuantes dosis necessites?: ");
        dosis = lector.nextInt();
        System.out.println("Quina hora es?");
        hora=lector.nextInt();
        for(int i=dosis;i<10;i++){
            falta= i+1;
            hora= hora+1;
            System.out.println("Et queden: "+falta +"a les "+ hora);
        }
    }
}
