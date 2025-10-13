/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.pkg10_exercise_bucles;

/**
 *
 * @author jfo9565
 */
public class Exercise_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String control = "No se ha detectado ningun valor critico";
       
        for (int i = -1; i < 20; i++) {
            if (i < 0) {
                control = "Hay errores de medida o pacientes ficticios";
            }
        }
        System.out.println(control);
        
    }
    
}
