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
        int any,mes,dia;
        any = preguntarData("Dime el año: ");
        mes = preguntarData("Dime el mes: ");
        dia = preguntarData("Dime el dia: ");
         if (validacioData(any,mes,dia)) {
            System.out.println("Data correcte");
        } else {
             System.out.println("Data no válida.");
        }
             

    }
    
    public static boolean validacioData(int a, int m,int d) {
        if (a<0) {
            return false;
        } else if (m>1||m<12){
            if (m==1 || m ==3 || m==5 || m==7 || m ==8 || m ==10 || m==12) {
                if (d<1 || d>31) {
                    return false;
                }
            } else if (m==4 || m ==6 || m==9 || m==11) {
                if (d<1 || d>30) {
                    return false;
                }
            } else if (m==2 && d>29){
                return false;
            } else { 
                return false;
            }
        }
        return true;
    }
    
    public static int preguntarData(String frase) {
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
