/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pulsacions;
import java.util.Random;
/**
 *
 * @author gga2951
 */
public class Pulsacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,num2,num3,num4,num5;
        Random ran = new Random();
        num = ran.nextInt(30,150);
        num2 = ran.nextInt(30,150);
        num3 = ran.nextInt(30,150);
        num4 = ran.nextInt(30,150);
        num5 = ran.nextInt(30,150);
        
        for(int i=0;i<1;i++){
            System.out.println("Pulsaciones per minut: "+num);
            System.out.println("Pulsaciones per minut: "+num2);
            System.out.println("Pulsaciones per minut: "+num3);
            System.out.println("Pulsaciones per minut: "+num4);
            System.out.println("Pulsaciones per minut: "+num5);
            num4 = (num+num2+num3+num4+num5)/3;
            System.out.println("Mitjana pulsacions per minut "+num4);
            
        }
    }
    
}
