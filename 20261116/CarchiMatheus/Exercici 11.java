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
        int num = preguntarNum("Digues el número del que vols la taula de multiplicar: ");
        System.out.println(taula(num));
        
    }
    
    public static String taula(int x) {
        String tauler = "";
        for (int i = 1;i<=10;i++){
            tauler +="\n"+ x+ " x " +i+ " = " + i*x ;
            // System.out.println(tauler);
        }
        
        return(tauler);
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
