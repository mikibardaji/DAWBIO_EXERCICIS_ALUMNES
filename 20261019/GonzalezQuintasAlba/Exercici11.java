/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*11.	El programa demana el nom d’un pacient i la seva temperatura corporal.
Ha de comprovar que la temperatura sigui numèrica i raonable, és a dir, entre 30 °C i 45 °C (ambdós inclosos).
Si la temperatura introduïda no és vàlida, el programa la torna a demanar fins que ho sigui.
Finalment, mostra un missatge amb el nom del pacient i la temperatura validada.
Exemple de sortida:
Introdueix el nom del pacient: Marc
Introdueix la temperatura corporal: 12
Temperatura no vàlida. Torna-ho a provar.
Introdueix la temperatura corporal: 37.2
Pacient registrat: Marc, 37.2 °C*/
        String n;
        float temp=0;
        Scanner nom=new Scanner(System.in);
        Scanner temperatura=new Scanner(System.in);
        System.out.println("Escriba su nombre : ");
        n=nom.nextLine();
        do{
            System.out.println("Introduzca temperatura : ");
            temp=temperatura.nextFloat();
            if(temp<30 || temp>45){
            System.out.println("Valor no valido. Intentelo de nuevo");
            }
        }while(temp<30.0 || temp>45.0);
        System.out.println("Gracias por proporcionar su temperatura");
    }
    }
    
}
