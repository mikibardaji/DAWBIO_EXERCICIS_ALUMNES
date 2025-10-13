/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.pkg10_exercise_bucles;

/**
 *
 * @author jfo9565
 */
public class Exercise_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables con for
        int control = 0;
       
        for (int i = 0; i < 20; i++) {
            if (i < 0) {
                control++;
            }
        }
        System.out.println("FOR: Hay " + control + " valores criticos.");
        
        //variables con while
        int contador = 18, control1 = 0, iteraciones = 20;
        
        while (iteraciones > 0){
            if (contador < 0) {
                control1++;
            }
            contador--;
            iteraciones--;
        }
        System.out.println("WHILE: Hay " + control1 + " valores criticos.");
    }
    
}
