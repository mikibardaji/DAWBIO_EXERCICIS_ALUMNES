/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programes.joc;
import java.util.Scanner
import java.util.Random
/**
 *
 * @author mca3765
 */
public class ProgramesJoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }


    public static int jugada() {
        Scanner lector = new Scanner(System.in);
        String frase = "Qué quieres sacar? (0 Piedra | 1 Papel | 2 tijera) \nIntroduce el número correspondiente: ";
        boolean valido = false;
        int resposta = 0;
        while (!valido) {
            try {
                System.out.print(frase);
                resposta = lector.nextInt();
                if (resposta >= 0 && resposta <= 2) {
                    valido = true;
                } else {
                    System.out.println("Valor no valido");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Carácter no valido, has de poner un número");
                System.out.println("");
                lector.nextLine();
                valido = false;
            }
        }
        return resposta;
    }
    
    
    
}
