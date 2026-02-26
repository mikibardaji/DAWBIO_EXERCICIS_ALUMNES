/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcions;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Excepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] llista= RellenarArray();
        PreguntarUsuari(llista);
        
    }
    public static  int[] RellenarArray(){
        Random rd = new Random();
        int[] llista = {
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11),
            rd.nextInt(1,11)
        };
        return llista;
    }
    public static void PreguntarUsuari(int [] llista){
        Scanner sc= new Scanner(System.in);
        int pos=0;
        do{
            try{
                System.out.print("Introduzca posicion de la lista: ");
                pos = sc.nextInt();
                System.out.println("Posicion "+ pos + " -> valor: " + llista[pos]);
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        } while (pos>0);
    }
    
}
