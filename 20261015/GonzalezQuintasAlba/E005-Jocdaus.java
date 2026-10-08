/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jocdaus;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ago4635
 */
public class Jocdaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 5. Joc de daus
Simula un joc de dos daus. Genera aleatoriament dos números entre 1 y 6.
El programa et demanarà quants diners vols apostar.
•	Si la suma dels dos numeros es 7 guanyaràs el mateix que has apostat. Mostra: “Bravo! Has guanyat X euros” (canvia la X pel valor aconseguit)
•	Si els dos numeros son iguals tornarà a tirar un altre cop:
◦	Si torna a sortir un doble (dos numeros iguals) guanyes el triple que has apostat. Mostra: “COMBO! Tripliques ganacies, has guanyat X euros”
◦	Qualsevol altre resultat guanyes el doble. Mostra “Has doblat el valor: guanyes X euros”
•	Si no la suma no es 7 ni es un doble mostra: “Has perdut l’aposta”.
*/
        Random numaleatori=new Random();
        Scanner lector=new Scanner(System.in);
        int aleatori=numaleatori.nextInt(1,7);
        System.out.println("Num aleatori es: "+ aleatori);
        System.out.println("Introduce el dinero a apostar");
        int dinero=lector.nextInt();
        if((dinero+aleatori)==7){
            System.out.println("Bravo! Has guanyat " + dinero + "euros" );
        }
        else if(dinero==aleatori){
            aleatori=numaleatori.nextInt(1,7);
            if(dinero==aleatori){
                System.out.println("COMBO! Tripliques ganacies, has guanyat" + (dinero*3) +  "euros");
            }
            else{
                System.out.println("Has doblat el valor: guanyes " + (dinero*2) + "euros");  
            }
        
        }
        else{
            System.out.println ("Has perdut l’aposta");
        }
        }
    }
    

