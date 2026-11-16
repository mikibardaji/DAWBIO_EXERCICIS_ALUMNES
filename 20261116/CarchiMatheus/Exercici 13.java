/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcio2;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mca3765
 */
public class Funcio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String caracterP = preguntarChar("Introdueix un caracter: ");
        int numFiles = preguntarNum("Introdueix el nº de files per construir un triangle: ");
        System.out.println(TriangleChar(caracterP,numFiles));
        
        
    }
    
    public static String TriangleChar(String caracter,int files) {
            String fila = "";
            String filaL = caracter;
            for(int i = 1;i<=files;i++){
                fila += filaL + "\n";
                filaL += caracter;
            }
           return fila;
            
        }
        
       
    
    public static String preguntarChar(String frase) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        String resposta = "";
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.next();
                valido = true;
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valid, has de posar un carácter");
                System.out.println("");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
        
        
    }
    
    
        public static int preguntarNum(String frase) {
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        int resposta = 0;
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.nextInt();
                if (resposta >= 0) {
                    valido = true;
                } else {
                    System.out.println("Valor no valid, ha de ser positiu");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valid, has de posar un número");
                System.out.println("");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
    }
}
