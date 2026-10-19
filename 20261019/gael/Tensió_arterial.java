/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tensió_arterial;
import java.util.Scanner;
/**
 *
 * @author gga2951
 */
public class Tensió_arterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pressio;
        boolean negatiu = false;
        
        Scanner lector = new Scanner(System.in);
        for(int i=0;i<10;i++){
            
            System.out.print((i+1)+"."+"Quina pressió arterial tens?: ");
            pressio = lector.nextInt();
            if (pressio <= 0){
                negatiu = true;
            }
        }
                    if (negatiu = true){
                System.out.println("Hay algun negativo");
            }else{
                System.out.println("Tot correcte");
            }
}
}