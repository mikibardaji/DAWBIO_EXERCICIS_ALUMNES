/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner lector = new Scanner(System.in);
        // OPCIO A
        final int LIMITE_LETRAS = 20;
        String cadena = "AT";
        //Hace bloques "AT"
        for (int i =1; i<(LIMITE_LETRAS/2) ; i++) {
            cadena = cadena + "AT";
        }
        System.out.println(cadena); 
        //OPCIO B
        cadena = "AT";
        boolean letraA = true;
        for (int i =2; i<(LIMITE_LETRAS) ; i++) {
            if (letraA) {
                cadena = cadena + "A";
                letraA = false;
            } else {
                cadena = cadena + "T";
                letraA = true;
            }
        }
        System.out.println(cadena);
        //OPCIO C
        
        
        
        }
        
    }
    

